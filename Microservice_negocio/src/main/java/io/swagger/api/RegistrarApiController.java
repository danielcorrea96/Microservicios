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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-01T20:34:13.321Z")

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
        /////////////////////////////  DATOS NECESARIOS ///////////////////////////////////////
        String id_admin = body.getNegocios().get(0).getIdAdmin();
        String id_negocio = body.getNegocios().get(0).getIdNegocio();
        String nombre_empresa = body.getNegocios().get(0).getNombreEmpresa();
        String nit = body.getNegocios().get(0).getNit();
        String tipo_negocio = body.getNegocios().get(0).getTipoNegocio();
        ///////////////////////////////////////////////////////////////////////////////////////
        
        
        if (id_admin.equals("00")) {
        	System.out.println("pasé");
        	RegistrarRequest save = userrepo.save(body.getNegocios().get(0));
        	responseSuccess.setIdNegocio(id_negocio);
        	responseSuccess.setNombreEmpresa(nombre_empresa);
        	responseSuccess.setTipoNegocio(tipo_negocio);
        	return new ResponseEntity<JsonApiBodyResponseSuccess>(responseSuccess, HttpStatus.OK);
        }else { 
        	responseErrors.setCodigo("001");
        	responseErrors.setDetalle("ERROR DE HEADERS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
        }
    }

}
