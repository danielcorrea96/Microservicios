package io.swagger.api;

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

    public ResponseEntity<?> eliminarIdDelete(@ApiParam(value = "Eliminar por ID de Oferta.",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
		JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
		OfertasRequest eliminarOferta = userrepo.findOne(id);
        if (accept != null && accept.contains("application/json")) {
            if (eliminarOferta != null) {
            	userrepo.delete(eliminarOferta.getId());
            	responseSuccess.setId(eliminarOferta.getIdnegocio());
            	responseSuccess.setFechafinal(eliminarOferta.getFechafinal());
            	responseSuccess.setFechainicio(eliminarOferta.getFechainicio());
            	responseSuccess.setIdnegocio(eliminarOferta.getIdnegocio());
            	responseSuccess.setProducto(eliminarOferta.getProducto());
            	return new ResponseEntity<JsonApiBodyResponseSuccess>(responseSuccess, HttpStatus.OK);
            } else {
            	responseErrors.setCodigo("0090");
            	responseErrors.setDetalle("NO SE ENCUENTRA EL ID DE NEGOCIO DIGITADO.");
            	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
            }
        } else { 
        	responseErrors.setCodigo("00");
        	responseErrors.setDetalle("ERROR HEADERS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
        }
    }

}
