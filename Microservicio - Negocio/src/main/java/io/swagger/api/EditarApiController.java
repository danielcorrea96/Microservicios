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
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-02T13:29:47.833Z")

@Controller
public class EditarApiController implements EditarApi {
	@Autowired
	UserRepository userrepo;
	
    private static final Logger log = LoggerFactory.getLogger(EditarApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EditarApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<?> editarPut(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequest body) {
        String accept = request.getHeader("Accept");
        JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
        JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        List<RegistrarRequest> busqIDAdmin = userrepo.findByIdadmin(body.getNegocios().get(0).getIdadmin());
        RegistrarRequest busqIDNegocio = userrepo.findOne(body.getNegocios().get(0).getIdnegocio());
        if (accept != null && accept.contains("application/json")) {
            if (!busqIDAdmin.isEmpty()) { 
            	if (busqIDNegocio != null) { 
            		RegistrarRequest cosa = userrepo.save(body.getNegocios().get(0));
            		responseSuccess.setIdNegocio(body.getNegocios().get(0).getIdnegocio());
            		responseSuccess.setNombreEmpresa(body.getNegocios().get(0).getNombreempresa());
            		responseSuccess.setTipoNegocio(body.getNegocios().get(0).getTiponegocio());
            		return new ResponseEntity<JsonApiBodyResponseSuccess>(responseSuccess, HttpStatus.OK);
            	} else { 
            		responseErrors.setCodigo("9879");
                	responseErrors.setDetalle("NO SE ENCONTRÓ EL ID DE NEGOCIO.");
                	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
            	}
            } else { 
            	responseErrors.setCodigo("9879");
            	responseErrors.setDetalle("NO SE ENCONTRÓ EL ID DEL ADMIN.");
            	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
            }
        } else { 
        	responseErrors.setCodigo("0909");
        	responseErrors.setDetalle("VERIFIQUE LOS HEADERS");
        }
        return new ResponseEntity<JsonApiBodyResponseSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

}
