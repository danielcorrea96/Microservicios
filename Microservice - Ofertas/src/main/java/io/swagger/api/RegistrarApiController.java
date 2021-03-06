package io.swagger.api;

import io.swagger.model.JsonApiBodyRequest;
import io.swagger.model.JsonApiBodyResponseErrors;
import io.swagger.model.JsonApiBodyResponseSuccess;
import io.swagger.model.OfertasRequest;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.repository.api.UserRepository;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-16T21:27:33.592Z")

@Controller
public class RegistrarApiController implements RegistrarApi {
	
	@Autowired	
	UserRepository userrepo;
	
    private static final Logger log = LoggerFactory.getLogger(RegistrarApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RegistrarApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<?> registrarPost(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequest body) {
        String accept = request.getHeader("Accept");
        JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
        JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        if (accept != null && accept.contains("application/json")) { 
        	System.out.println("Entro");
        	
        	OfertasRequest cosa = userrepo.save(body.getOfertas().get(0));
        	responseSuccess.setId(body.getOfertas().get(0).getId());
        	responseSuccess.setIdnegocio(body.getOfertas().get(0).getIdnegocio());
        	responseSuccess.setFechainicio(body.getOfertas().get(0).getFechainicio());
        	responseSuccess.setFechafinal(body.getOfertas().get(0).getFechafinal());
        	responseSuccess.setProducto(body.getOfertas().get(0).getProducto());
        	return new ResponseEntity<JsonApiBodyResponseSuccess>(responseSuccess, HttpStatus.OK);
            
        } else { 
        	responseErrors.setCodigo("0909");
        	responseErrors.setDetalle("ERROR DE HEADERS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(HttpStatus.FAILED_DEPENDENCY);
        }
    }

}
