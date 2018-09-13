package io.swagger.api;

import io.swagger.model.JsonApiBodyRequest;
import io.swagger.model.JsonApiBodyResponseErrors;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-01T20:34:13.321Z")

@Controller
public class ListarApiController implements ListarApi {

    private static final Logger log = LoggerFactory.getLogger(ListarApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ListarApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<JsonApiBodyRequest> listarGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequest>(objectMapper.readValue("{  \"negocios\" : [ {    \"tipo_negocio\" : \"tipo_negocio\",    \"ubicacion\" : \"ubicacion\",    \"correo_empresa\" : \"correo_empresa\",    \"foto\" : \"foto\",    \"id_negocio\" : \"id_negocio\",    \"nombre_empresa\" : \"nombre_empresa\",    \"id_admin\" : \"id_admin\",    \"nit\" : \"nit\",    \"detalle\" : \"detalle\"  }, {    \"tipo_negocio\" : \"tipo_negocio\",    \"ubicacion\" : \"ubicacion\",    \"correo_empresa\" : \"correo_empresa\",    \"foto\" : \"foto\",    \"id_negocio\" : \"id_negocio\",    \"nombre_empresa\" : \"nombre_empresa\",    \"id_admin\" : \"id_admin\",    \"nit\" : \"nit\",    \"detalle\" : \"detalle\"  } ]}", JsonApiBodyRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequest> listarIdadminIdAdminGet(@ApiParam(value = "Negocios del administrador",required=true) @PathVariable("id_admin") String idAdmin) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequest>(objectMapper.readValue("{  \"negocios\" : [ {    \"tipo_negocio\" : \"tipo_negocio\",    \"ubicacion\" : \"ubicacion\",    \"correo_empresa\" : \"correo_empresa\",    \"foto\" : \"foto\",    \"id_negocio\" : \"id_negocio\",    \"nombre_empresa\" : \"nombre_empresa\",    \"id_admin\" : \"id_admin\",    \"nit\" : \"nit\",    \"detalle\" : \"detalle\"  }, {    \"tipo_negocio\" : \"tipo_negocio\",    \"ubicacion\" : \"ubicacion\",    \"correo_empresa\" : \"correo_empresa\",    \"foto\" : \"foto\",    \"id_negocio\" : \"id_negocio\",    \"nombre_empresa\" : \"nombre_empresa\",    \"id_admin\" : \"id_admin\",    \"nit\" : \"nit\",    \"detalle\" : \"detalle\"  } ]}", JsonApiBodyRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequest> listarIdnegocioIdNegocioGet(@ApiParam(value = "Negocio por ID de negocio.",required=true) @PathVariable("id_negocio") String idNegocio) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequest>(objectMapper.readValue("{  \"negocios\" : [ {    \"tipo_negocio\" : \"tipo_negocio\",    \"ubicacion\" : \"ubicacion\",    \"correo_empresa\" : \"correo_empresa\",    \"foto\" : \"foto\",    \"id_negocio\" : \"id_negocio\",    \"nombre_empresa\" : \"nombre_empresa\",    \"id_admin\" : \"id_admin\",    \"nit\" : \"nit\",    \"detalle\" : \"detalle\"  }, {    \"tipo_negocio\" : \"tipo_negocio\",    \"ubicacion\" : \"ubicacion\",    \"correo_empresa\" : \"correo_empresa\",    \"foto\" : \"foto\",    \"id_negocio\" : \"id_negocio\",    \"nombre_empresa\" : \"nombre_empresa\",    \"id_admin\" : \"id_admin\",    \"nit\" : \"nit\",    \"detalle\" : \"detalle\"  } ]}", JsonApiBodyRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequest> listarTiponegocioTipoNegocioGet(@ApiParam(value = "Tipo de negocio",required=true) @PathVariable("tipo_negocio") String tipoNegocio) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequest>(objectMapper.readValue("{  \"negocios\" : [ {    \"tipo_negocio\" : \"tipo_negocio\",    \"ubicacion\" : \"ubicacion\",    \"correo_empresa\" : \"correo_empresa\",    \"foto\" : \"foto\",    \"id_negocio\" : \"id_negocio\",    \"nombre_empresa\" : \"nombre_empresa\",    \"id_admin\" : \"id_admin\",    \"nit\" : \"nit\",    \"detalle\" : \"detalle\"  }, {    \"tipo_negocio\" : \"tipo_negocio\",    \"ubicacion\" : \"ubicacion\",    \"correo_empresa\" : \"correo_empresa\",    \"foto\" : \"foto\",    \"id_negocio\" : \"id_negocio\",    \"nombre_empresa\" : \"nombre_empresa\",    \"id_admin\" : \"id_admin\",    \"nit\" : \"nit\",    \"detalle\" : \"detalle\"  } ]}", JsonApiBodyRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

}
