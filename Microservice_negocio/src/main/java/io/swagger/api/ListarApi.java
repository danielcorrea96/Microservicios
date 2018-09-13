/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.JsonApiBodyRequest;
import io.swagger.model.JsonApiBodyResponseErrors;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-01T20:34:13.321Z")

@Api(value = "listar", description = "the listar API")
public interface ListarApi {

    @ApiOperation(value = "Listado de negocios", nickname = "listarGet", notes = "Listado de negocios en la tabla negocios de la base de datos.", response = JsonApiBodyRequest.class, tags={ "negocios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 404, message = "Negocio no encontrada(s)", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequest> listarGet();


    @ApiOperation(value = "Listado de negocios por administrador", nickname = "listarIdadminIdAdminGet", notes = "Listado de negocios por administrador en la tabla negocios de la base de datos.", response = JsonApiBodyRequest.class, tags={ "negocios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 404, message = "Negocios no encontrados", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/idadmin/{id_admin}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequest> listarIdadminIdAdminGet(@ApiParam(value = "Negocios del administrador",required=true) @PathVariable("id_admin") String idAdmin);


    @ApiOperation(value = "Busqueda de negocio por id de negocio.", nickname = "listarIdnegocioIdNegocioGet", notes = "Busqueda de negocio por id de negocio en la tabla negocio de la base de datos.", response = JsonApiBodyRequest.class, tags={ "negocios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 404, message = "Negocio no encontrado.", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/idnegocio/{id_negocio}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequest> listarIdnegocioIdNegocioGet(@ApiParam(value = "Negocio por ID de negocio.",required=true) @PathVariable("id_negocio") String idNegocio);


    @ApiOperation(value = "Listado de negocios por tipos de negocios.", nickname = "listarTiponegocioTipoNegocioGet", notes = "Listado de negocios por tipos de negocio en la tabla negocios de la base de datos.", response = JsonApiBodyRequest.class, tags={ "negocios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 404, message = "Negocio no encontrado.", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/tiponegocio/{tipo_negocio}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequest> listarTiponegocioTipoNegocioGet(@ApiParam(value = "Tipo de negocio",required=true) @PathVariable("tipo_negocio") String tipoNegocio);

}
