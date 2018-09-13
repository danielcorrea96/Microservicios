package io.swagger.api;

import io.swagger.model.JsonApiBodyRequest;
import io.swagger.model.JsonApiBodyResponseErrors;
import io.swagger.model.JsonApiBodyResponseSuccess;
import io.swagger.model.RegistrarRequest;

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
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-02T13:29:47.833Z")

@Controller
public class ListarApiController implements ListarApi {
	
	@Autowired	
	UserRepository userrepo; 
	
    private static final Logger log = LoggerFactory.getLogger(ListarApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ListarApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<?> listarGet() {
        String accept = request.getHeader("Accept");
    	JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess(); 
        if (accept != null && accept.contains("application/json")) {            
			List<RegistrarRequest> lista = (List<RegistrarRequest>)userrepo.findAll();			
			JsonApiBodyRequest body1 = new JsonApiBodyRequest();
        	body1.setNegocios(lista);
            return new ResponseEntity<JsonApiBodyRequest>(body1, HttpStatus.OK);
        } else { 
        	responseErrors.setCodigo("898");
        	responseErrors.setDetalle("REVISA LOS HEADERS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors,HttpStatus.FAILED_DEPENDENCY);
        }        
    }

    public ResponseEntity<?> listarIdadminIdAdminGet(@ApiParam(value = "Negocios del administrador",required=true) @PathVariable("id_admin") String idAdmin) {
        String accept = request.getHeader("Accept");
        List<RegistrarRequest> persona = userrepo.findByIdadmin(idAdmin);

		JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        if (accept != null && accept.contains("application/json")) {
        		if ( !persona.isEmpty() ) {
        		JsonApiBodyRequest body1 = new JsonApiBodyRequest(); 	                       
	            body1.setNegocios(persona); // seteo el negocio y se le envia la lista del id que se quere buscar.    	            
				return new ResponseEntity<JsonApiBodyRequest>(body1, HttpStatus.OK); 	
        		} else { 
        			responseErrors.setCodigo("0909");
                	responseErrors.setDetalle("EL ID NO SE ENCUENTRA.");
                	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors,HttpStatus.FAILED_DEPENDENCY);	
        		}
        } else { 
        	responseErrors.setCodigo("0909");
        	responseErrors.setDetalle("LOS HEADERS ESTAN INCORRECTOS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors,HttpStatus.FAILED_DEPENDENCY);
        }    
    }

    public ResponseEntity<?> listarIdnegocioIdNegocioGet(@ApiParam(value = "Negocio por ID de negocio.",required=true) @PathVariable("id_negocio") String idNegocio) {
        String accept = request.getHeader("Accept");
        List<RegistrarRequest> negocio = userrepo.findByIdnegocio(idNegocio);
        JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        if (accept != null && accept.contains("application/json")) {
           if (!negocio.isEmpty()) { 
        	   	JsonApiBodyRequest body1 = new JsonApiBodyRequest(); 	                       
	            body1.setNegocios(negocio); // seteo el negocio y se le envia la lista del id que se quere buscar.    	            
				return new ResponseEntity<JsonApiBodyRequest>(body1, HttpStatus.OK);         	   
           } else { 
        	   responseErrors.setCodigo("090");
        	   responseErrors.setDetalle("NO SE ENCONTRÓ ID DE NEGOCIO.");
           }
        }	else { 
        	responseErrors.setCodigo("0909");
        	responseErrors.setDetalle("LOS HEADERS ESTAN INCORRECTOS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors,HttpStatus.FAILED_DEPENDENCY);
        }  

        return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<?> listarTiponegocioTipoNegocioGet(@ApiParam(value = "Tipo de negocio",required=true) @PathVariable("tipo_negocio") String tipoNegocio) {
        String accept = request.getHeader("Accept");
        List<RegistrarRequest> negocio = userrepo.findByTiponegocio(tipoNegocio);        
        JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        if (accept != null && accept.contains("application/json")) {        	
    		if (!negocio.isEmpty()) {
        	   	JsonApiBodyRequest body1 = new JsonApiBodyRequest(); 	                       
	            body1.setNegocios(negocio); // seteo el negocio y se le envia la lista del id que se quere buscar.    	            
				return new ResponseEntity<JsonApiBodyRequest>(body1, HttpStatus.OK); 
    		} else { 
    			responseErrors.setCodigo("9090");
    			responseErrors.setDetalle("NO SE ENCUENTRA EL TIPO DE NEGOCIO DIGITADO.");
    			return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors,HttpStatus.FAILED_DEPENDENCY);
    		}
    		
        } else { 
        	responseErrors.setCodigo("0909");
        	responseErrors.setDetalle("LOS HEADERS ESTAN INCORRECTOS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors,HttpStatus.FAILED_DEPENDENCY);	
        }
    }

}
