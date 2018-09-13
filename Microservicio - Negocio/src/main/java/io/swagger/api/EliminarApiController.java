package io.swagger.api;

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
public class EliminarApiController implements EliminarApi {
	@Autowired
	UserRepository userrepo;
	
    private static final Logger log = LoggerFactory.getLogger(EliminarApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EliminarApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<?> eliminarIdNegocioDelete(@ApiParam(value = "Eliminar por ID de negocio.",required=true) @PathVariable("id_negocio") String idNegocio) {
        String accept = request.getHeader("Accept");
		JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
		 RegistrarRequest eliminarNegocio = userrepo.findOne(idNegocio);
        if (accept != null && accept.contains("application/json")) {
            if (eliminarNegocio != null) { 
            	userrepo.delete(eliminarNegocio.getIdnegocio());
            	responseSuccess.setIdNegocio(eliminarNegocio.getIdnegocio());
            	responseSuccess.setNombreEmpresa(eliminarNegocio.getNombreempresa());
            	responseSuccess.setTipoNegocio(eliminarNegocio.getTiponegocio());
            	return new ResponseEntity<JsonApiBodyResponseSuccess>(responseSuccess, HttpStatus.OK);
            } else { 
            	responseErrors.setCodigo("0090");
            	responseErrors.setDetalle("NO SE ENCUENTRA EL ID DE NEGOCIO DIGITADO.");
            	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
            }
        } 
        return new ResponseEntity<JsonApiBodyResponseSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

}
