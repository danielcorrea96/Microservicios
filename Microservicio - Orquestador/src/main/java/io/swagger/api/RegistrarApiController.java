package io.swagger.api;

import io.swagger.model.JsonApiBodyRequest;
import io.swagger.model.JsonApiBodyResponseErrors;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-10T20:41:16.454Z")

@Controller
public class RegistrarApiController implements RegistrarApi {
	
	@EndpointInject(uri="direct:post-personas")
    private FluentProducerTemplate producerNegocio;


    private static final Logger log = LoggerFactory.getLogger(RegistrarApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RegistrarApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<JsonApiBodyResponseSuccess> registrarPost(@ApiParam(value = "body" ,required=true )  
    @Valid @RequestBody JsonApiBodyRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	
            try {
            	System.out.println(body);
                Object response = producerNegocio.request();
//                JsonApiBodyResponseSuccess exito = new JsonApiBodyResponseSuccess();  
//                System.out.println(response);
//                        JSONObject jsonArray = new JSONObject(response.toString());
//                        exito.setEstado(jsonArray.getString("estado"));
//                        exito.setId(jsonArray.getString("id"));
//                        exito.setNombre(jsonArray.getString("nombre"));
//                        return new ResponseEntity<JsonApiBodyResponseSuccess>(exito, HttpStatus.OK);
            } catch (Exception e) {
                System.out.println("PROBLEMAS EN EL ORQUESTADOR");
                return new ResponseEntity<JsonApiBodyResponseSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyResponseSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

}
