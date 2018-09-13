/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.JsonApiBodyRequest;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-10T20:41:16.454Z")

@Api(value = "registrar", description = "the registrar API")
public interface RegistrarApi {

    @ApiOperation(value = "Registro personas", nickname = "registrarPost", notes = "Registro de personas (clientes y administradores)", response = JsonApiBodyResponseSuccess.class, tags={ "personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Persona registrada correctamente.", response = JsonApiBodyResponseSuccess.class),
        @ApiResponse(code = 400, message = "Datos incompletos o incorrectos.", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/registrar",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<JsonApiBodyResponseSuccess> registrarPost(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequest body);

}
