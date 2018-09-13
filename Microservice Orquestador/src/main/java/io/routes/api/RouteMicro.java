package io.routes.api;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import io.swagger.model.JsonApiBodyRequest;
import io.swagger.model.JsonApiBodyRequest2;

public class RouteMicro extends RouteBuilder {
    @Override
    public void configure() throws Exception {
          from("direct:post-negocios")
                 .routeId("Personas")
                 .setHeader(Exchange.HTTP_METHOD, constant("POST")) 
                 .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                 .setHeader("Accept", constant("application/json"))
                 .process(new Processor() {
					@Override
					public void process(Exchange exchange) throws Exception {
						JsonApiBodyRequest2 requestPersona = (JsonApiBodyRequest2) exchange.getIn().getBody();
						exchange.setProperty("adminKey", requestPersona.getPersona().get(0).getAdminKey());
						exchange.setProperty("rol", requestPersona.getPersona().get(0).getRol());
						exchange.setProperty("id", requestPersona.getPersona().get(0).getId());
						exchange.setProperty("estado", requestPersona.getPersona().get(0).getEstado());
						exchange.setProperty("correo", requestPersona.getPersona().get(0).getCorreo());
					}
                	 
                 })
                 .to("freemarker:templates/GetPersonas.ftl")
                 .hystrix()
                 .hystrixConfiguration().executionTimeoutInMilliseconds(2000).end()
                 .to("http4://localhost:8090/personas/listar")
                 .convertBodyTo(String.class)
                 .endHystrix()
                 .onFallback()
                 .log("se respondio esto ${body}")
                 .end();
    }


}
