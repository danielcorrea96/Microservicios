/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.JsonApiBodyResponseErrors;
import io.swagger.model.JsonApiBodyResponseSuccess;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-02T13:29:47.833Z")

@Api(value = "eliminar", description = "the eliminar API")
public interface EliminarApi {

    @ApiOperation(value = "Eliminar negocio", nickname = "eliminarIdNegocioDelete", notes = "Eliminar persona por id de negocio.", response = JsonApiBodyResponseSuccess.class, tags={ "negocios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Eliminar por id de negocio", response = JsonApiBodyResponseSuccess.class),
        @ApiResponse(code = 404, message = "Personas no encontradas", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/eliminar/{id_negocio}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<?> eliminarIdNegocioDelete(@ApiParam(value = "Eliminar por ID de negocio.",required=true) @PathVariable("id_negocio") String idNegocio);

}
