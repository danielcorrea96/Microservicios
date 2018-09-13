package io.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import io.swagger.model.JsonApiBodyRequest;


@Component
public class RoutesPersona extends RouteBuilder {	
    @Override
    public void configure() throws Exception {
          from("direct:post-personas")
                 .routeId("personas")
                 .log("osvaldo estoy aqui")
                 .setHeader(Exchange.HTTP_METHOD, constant("POST")) 
                 .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                 .setHeader("Accept", constant("application/json"))
                 .log("request microservice para persona ${body}")
                 .process(new Processor() {
                        @Override
                        public void process(Exchange exchange) throws Exception {
                               // TODO Auto-generated method stub
                               JsonApiBodyRequest requestPersona = (JsonApiBodyRequest) exchange.getIn().getBody();
                               //exchange.setProperty("id", requestPersona.getPersona().get(0).getId());
                               exchange.setProperty("id", requestPersona.getPersona().get(0).getId());
                               exchange.setProperty("nombre", requestPersona.getPersona().get(0).getNombre());
                               exchange.setProperty("apellidos", requestPersona.getPersona().get(0).getApellidos());
                               exchange.setProperty("contrasena", requestPersona.getPersona().get(0).getContrasena());
                               exchange.setProperty("correo", requestPersona.getPersona().get(0).getCorreo());
                               exchange.setProperty("telefono", requestPersona.getPersona().get(0).getTelefono());
                               exchange.setProperty("genero", requestPersona.getPersona().get(0).getGenero());
                               exchange.setProperty("rol", requestPersona.getPersona().get(0).getRol());
                               exchange.setProperty("estado", requestPersona.getPersona().get(0).getEstado());
                               exchange.setProperty("token", requestPersona.getPersona().get(0).getToken());
                               exchange.setProperty("adminKey", requestPersona.getPersona().get(0).getadminKey());
                               System.out.println("hola");
                               
                        }
                 })
                 .log("ANTES ${body}")
                 .to("freemarker:templates/PostPersona.ftl")
                 
                 .hystrix()
                 .hystrixConfiguration().executionTimeoutInMilliseconds(2000).end()
                 .to("http4://localhost:8090/personas/registrar")
                 .convertBodyTo(String.class)
                 .log("response microservice  ${body}")
                 //.unmarshal().json(JsonLibrary.Jackson, ClientJsonApiBodyResponseSuccess.class)
                 .endHystrix()
                 .onFallback()
                 .log("se respondio esto ${body}")
                 .end();
    }

}
