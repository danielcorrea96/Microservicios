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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-16T21:27:33.592Z")

@Api(value = "listar", description = "the listar API")
public interface ListarApi {

    @ApiOperation(value = "Busqueda por descuento.", nickname = "listarDescuentoDescuentoGet", notes = "Busqueda de ofertas por descuento en la tabla ofertas de la base de datos.", response = JsonApiBodyRequest.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 404, message = "Oferta no encontrada.", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/descuento/{descuento}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<?> listarDescuentoDescuentoGet(@ApiParam(value = "Listar por Descuento del producto.",required=true) @PathVariable("descuento") String descuento);
    
    @ApiOperation(value = "Busqueda por ID Negocio.", nickname = "listarIDNegocio", notes = "Busqueda de ofertas por id negocio en la tabla ofertas de la base de datos.", response = JsonApiBodyRequest.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 404, message = "Oferta no encontrada.", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/idnegocio/{idnegocio}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<?> listarIDNegocio(@ApiParam(value = "Listar por idnegocio del producto.",required=true) @PathVariable("idnegocio") String idNegocio);

    

    @ApiOperation(value = "Busqueda de ofertas por fecha.", nickname = "listarFechainicioFechainicioGet", notes = "Busqueda de ofertas por fecha en la tabla ofertas de la base de datos.", response = JsonApiBodyRequest.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 404, message = "Oferta no encontrada.", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/fechainicio/{fechainicio}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<?> listarFechainicioFechainicioGet(@ApiParam(value = "Listar por fecha del producto.",required=true) @PathVariable("fechainicio") String fechainicio);


    @ApiOperation(value = "Listado de ofertas", nickname = "listarGet", notes = "Listado de ofertas en la tabla ofertas de la base de datos.", response = JsonApiBodyRequest.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 404, message = "Oferta no encontrada(s)", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<?> listarGet();


    @ApiOperation(value = "Listado de negocios por administrador", nickname = "listarIdIdGet", notes = "Listado de negocios por administrador en la tabla negocios de la base de datos.", response = JsonApiBodyRequest.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 404, message = "Oferta no encontrada.", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/id/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<?> listarIdIdGet(@ApiParam(value = "ID de Oferta",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "Listado de ofertas por producto.", nickname = "listarProductoProductoGet", notes = "Listado de Ofertas por productos en la tabla ofertas de la base de datos.", response = JsonApiBodyRequest.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 404, message = "Oferta no encontrada.", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/producto/{producto}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<?> listarProductoProductoGet(@ApiParam(value = "Ofertas por productos.",required=true) @PathVariable("producto") String producto);

    @ApiOperation(value = "Listado de ofertas por tipo de oferta.", nickname = "listarTipodeOferta", notes = "Listado de Ofertas por tipo de ofertas en la tabla ofertas de la base de datos.", response = JsonApiBodyRequest.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 404, message = "Oferta no encontrada.", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/tipodeoferta/{tipodeoferta}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<?> listarTipodeOferta(@ApiParam(value = "Ofertas por tipo de oferta.",required=true) @PathVariable("tipodeoferta") String tipodeoferta);
    
    
    
    @ApiOperation(value = "Busqueda de ofertas por valor del producto.", nickname = "listarValorValorGet", notes = "Busqueda de negocio por valor en la tabla oferta de la base de datos.", response = JsonApiBodyRequest.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 404, message = "Oferta no encontrada.", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/valor/{valor}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<?> listarValorValorGet(@ApiParam(value = "Listar por Valor del producto.",required=true) @PathVariable("valor") String valor);

//    @ApiOperation(value = "Busqueda de ofertas por idnegocio y tipodeoferta", nickname = "listarIDNeTipoOfert", notes = "Busqueda de ofertas por idnegocio y tipodeofertas en la tabla oferta de la base de datos.", response = JsonApiBodyRequest.class, tags={ "ofertas", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequest.class),
//        @ApiResponse(code = 404, message = "Oferta no encontrada.", response = JsonApiBodyResponseErrors.class) })
//    @RequestMapping(value = "/listar/idnegtipoofert/{idnegocio}/{tipodeoferta}",
//        produces = { "application/json" }, 
//        method = RequestMethod.GET)
//    ResponseEntity<?> listarIDNeTipoOfert(@ApiParam(value = "Listar por idnegocio y tipo de oferta.",required=true) @PathVariable("idnegocio"/"tipodeoferta") String valor);
}