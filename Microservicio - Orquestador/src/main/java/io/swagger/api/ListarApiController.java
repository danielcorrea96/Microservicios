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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-10T20:41:16.454Z")

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

    public ResponseEntity<JsonApiBodyRequest> listarEstadoEstadoGet(@ApiParam(value = "Estado de la persona",required=true) @PathVariable("estado") String estado) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequest>(objectMapper.readValue("{  \"persona\" : [ {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"negocio\" : [ {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    }, {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    } ],    \"nombre\" : \"nombre\",    \"rol\" : \"rol\"  }, {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"negocio\" : [ {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    }, {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    } ],    \"nombre\" : \"nombre\",    \"rol\" : \"rol\"  } ]}", JsonApiBodyRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequest> listarGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequest>(objectMapper.readValue("{  \"persona\" : [ {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"negocio\" : [ {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    }, {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    } ],    \"nombre\" : \"nombre\",    \"rol\" : \"rol\"  }, {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"negocio\" : [ {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    }, {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    } ],    \"nombre\" : \"nombre\",    \"rol\" : \"rol\"  } ]}", JsonApiBodyRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequest> listarIdGet(@ApiParam(value = "ID de la persona",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequest>(objectMapper.readValue("{  \"persona\" : [ {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"negocio\" : [ {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    }, {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    } ],    \"nombre\" : \"nombre\",    \"rol\" : \"rol\"  }, {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"negocio\" : [ {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    }, {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    } ],    \"nombre\" : \"nombre\",    \"rol\" : \"rol\"  } ]}", JsonApiBodyRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequest> listarRolRolGet(@ApiParam(value = "Estado de la persona",required=true) @PathVariable("rol") String rol) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequest>(objectMapper.readValue("{  \"persona\" : [ {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"negocio\" : [ {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    }, {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    } ],    \"nombre\" : \"nombre\",    \"rol\" : \"rol\"  }, {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"negocio\" : [ {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    }, {      \"nombre_negocio\" : \"nombre_negocio\",      \"ubicacion\" : \"ubicacion\",      \"foto\" : \"foto\",      \"id_negocio\" : \"id_negocio\",      \"categoria\" : \"categoria\",      \"nit\" : \"nit\",      \"detalle\" : \"detalle\"    } ],    \"nombre\" : \"nombre\",    \"rol\" : \"rol\"  } ]}", JsonApiBodyRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

}
