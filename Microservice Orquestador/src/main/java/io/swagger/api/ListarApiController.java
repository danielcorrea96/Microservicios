package io.swagger.api;

import io.swagger.model.JsonApiBodyRequest;
import io.swagger.model.JsonApiBodyRequest2;
import io.swagger.model.JsonApiBodyResponseErrors;
import io.swagger.model.JsonApiBodyResponseErrors2;
import io.swagger.model.JsonApiBodyResponseSuccess;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;

import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-24T20:36:36.275Z")

@Controller
public class ListarApiController implements ListarApi {

    private static final Logger log = LoggerFactory.getLogger(ListarApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @EndpointInject(uri="direct:post-persona")
    private FluentProducerTemplate producerNegocio;


    @org.springframework.beans.factory.annotation.Autowired
    public ListarApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<JsonApiBodyRequest> listarNegociosGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {


        }

        return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyResponseSuccess> listarPersonasPost(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequest2 body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	try {
        	Object response = producerNegocio.withBody(body).request();
            JsonApiBodyResponseSuccess exito = new JsonApiBodyResponseSuccess(); 
            JSONObject jsonArray = new JSONObject(response.toString());
            exito.setId(jsonArray.getString("id"));
            exito.setEstado(jsonArray.getString("estado"));
            exito.setNombre(jsonArray.getString("correo"));
            return new ResponseEntity<JsonApiBodyResponseSuccess>(exito, HttpStatus.OK); 
        	}
         catch (Exception e) {
			// TODO: handle exception
        	System.out.println("PROBLEMAS EN EL ORQUESTADOR");
		}

        
    }
        return new ResponseEntity<JsonApiBodyResponseSuccess>(HttpStatus.NOT_IMPLEMENTED);

    }	
}
