package io.swagger.api;

import io.swagger.model.JsonApiBodyRequest;
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
public class ListarApiController implements ListarApi {
	
	 @Autowired
	 public UserRepository userRepository;
	 

    private static final Logger log = LoggerFactory.getLogger(ListarApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ListarApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<?> listarDescuentoDescuentoGet(@ApiParam(value = "Listar por Descuento del producto.",required=true) @PathVariable("descuento") String descuento) {
        String accept = request.getHeader("Accept");
    	JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        if (accept != null && accept.contains("application/json")) {
        	List<OfertasRequest> descuent = userRepository.findByDescuento(descuento);
        	if ( !descuent.isEmpty()) {         		
        		JsonApiBodyRequest body1 = new JsonApiBodyRequest(); 	                       
                body1.setOfertas(descuent); // seteo el negocio y se le envia la lista del id que se quere buscar. 
                return new ResponseEntity<JsonApiBodyRequest>(body1, HttpStatus.OK); 
        	} else {
        		responseErrors.setCodigo("009");
        		responseErrors.setDetalle("NO SE ENCONTRÓ EL DESCUENTO SOLICITADO.");
        	}
        	
        } else {
        	responseErrors.setCodigo("00");
        	responseErrors.setDetalle("ERROR HEADERS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
        }
        return new ResponseEntity<JsonApiBodyRequest>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    public ResponseEntity<?> listarIDNegocio(@ApiParam(value = "Listar por Id Negocio del producto.",required=true) @PathVariable("idnegocio") String idnegocio) {
        String accept = request.getHeader("Accept");
    	JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        if (accept != null && accept.contains("application/json")) {
        	List<OfertasRequest> idnegocio2 = userRepository.findByIdnegocio(idnegocio);
        	if ( !idnegocio2.isEmpty()) {         		
        		JsonApiBodyRequest body1 = new JsonApiBodyRequest(); 	                       
                body1.setOfertas(idnegocio2); // seteo el negocio y se le envia la lista del id que se quere buscar. 
                return new ResponseEntity<JsonApiBodyRequest>(body1, HttpStatus.OK); 
        	} else {
        		responseErrors.setCodigo("009");
        		responseErrors.setDetalle("NO SE ENCONTRÓ EL ID SOLICITADO.");
        		return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
        	}
        	
        } else {
        	responseErrors.setCodigo("00");
        	responseErrors.setDetalle("ERROR HEADERS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
        }

    }

    public ResponseEntity<?> listarFechainicioFechainicioGet(@ApiParam(value = "Listar por fecha del producto.",required=true) @PathVariable("fechainicio") String fechainicio) {
        String accept = request.getHeader("Accept");
    	JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        if (accept != null && accept.contains("application/json")) {
            List<OfertasRequest> fechainicio2 = userRepository.findByFechainicio(fechainicio);
            if (!fechainicio2.isEmpty()) {
            	JsonApiBodyRequest body1 = new JsonApiBodyRequest(); 	
            	body1.setOfertas(fechainicio2);
            	 return new ResponseEntity<JsonApiBodyRequest>(body1, HttpStatus.OK);
            } else {
            	responseErrors.setCodigo("009");
        		responseErrors.setDetalle("NO SE ENCONTRÓ LA FECHA SOLICITADA.");
        		return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
            }
        } else {
        	responseErrors.setCodigo("00");
        	responseErrors.setDetalle("ERROR HEADERS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
        }
        
    }

    public ResponseEntity<?> listarGet() {
        String accept = request.getHeader("Accept");
        JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        if (accept != null && accept.contains("application/json")) {
            List<OfertasRequest> todo = (List<OfertasRequest>) userRepository.findAll();
            if (!todo.isEmpty()) {
            	JsonApiBodyRequest body1 = new JsonApiBodyRequest();
            	body1.setOfertas(todo);
            	return new ResponseEntity<JsonApiBodyRequest>(body1, HttpStatus.OK);
            } else {
            	responseErrors.setCodigo("9238");
            	responseErrors.setCodigo("NO SE ENCONTRÓ NADA EN DATABASE.");
            	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
            }
        } else {
        	responseErrors.setCodigo("00");
        	responseErrors.setDetalle("ERROR HEADERS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
        }
    }

    public ResponseEntity<?> listarIdIdGet(@ApiParam(value = "ID de Oferta",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        if (accept != null && accept.contains("application/json")) {
            List<OfertasRequest> XId = userRepository.findById(id);
            if (!XId.isEmpty()) {
            	JsonApiBodyRequest body1 = new JsonApiBodyRequest();
            	body1.setOfertas(XId);
            	return new ResponseEntity<JsonApiBodyRequest>(body1, HttpStatus.OK);
            } else { 
            	responseErrors.setCodigo("992018");
            	responseErrors.setDetalle("NO SE ENCONTRÓ EL ID DIGITADO");
            	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
            }
        } else {
        	responseErrors.setCodigo("00");
        	responseErrors.setDetalle("ERROR HEADERS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
        }         
    }

    public ResponseEntity<?> listarProductoProductoGet(@ApiParam(value = "Ofertas por productos.",required=true) @PathVariable("producto") String producto) {
        String accept = request.getHeader("Accept");
        JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        if (accept != null && accept.contains("application/json")) {
            List<OfertasRequest> product = userRepository.findByProducto(producto);
            if (!product.isEmpty()) {
            	JsonApiBodyRequest body1 = new JsonApiBodyRequest();
            	body1.setOfertas( product);
            	return new ResponseEntity<JsonApiBodyRequest>(body1, HttpStatus.OK);
            } else {
            	responseErrors.setCodigo("992018");
            	responseErrors.setDetalle("NO SE ENCONTRÓ EL PRODUCTO DIGITADO.");
            	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
            }
            
        } else {
        	responseErrors.setCodigo("00");
        	responseErrors.setDetalle("ERROR HEADERS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
        }

    }
    
    public ResponseEntity<?> listarTipodeOferta(@ApiParam(value = "Ofertas por tipo de ofertas.",required=true) @PathVariable("tipodeoferta") String tipodeoferta) {
        String accept = request.getHeader("Accept");
        JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        if (accept != null && accept.contains("application/json")) {
            List<OfertasRequest> product = userRepository.findByTipodeoferta(tipodeoferta);
            if (!product.isEmpty()) {
            	JsonApiBodyRequest body1 = new JsonApiBodyRequest();
            	body1.setOfertas( product);
            	return new ResponseEntity<JsonApiBodyRequest>(body1, HttpStatus.OK);
            } else {
            	responseErrors.setCodigo("992018");
            	responseErrors.setDetalle("NO SE ENCONTRÓ EL TIPO DE OFERTA DIGITADO.");
            	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
            }
            
        } else {
        	responseErrors.setCodigo("00");
        	responseErrors.setDetalle("ERROR HEADERS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
        }

    }
    
    
    
    

    public ResponseEntity<?> listarValorValorGet(@ApiParam(value = "Listar por Valor del producto.",required=true) @PathVariable("valor") String valor) {
        String accept = request.getHeader("Accept");
        JsonApiBodyResponseErrors responseErrors = new JsonApiBodyResponseErrors();
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        if (accept != null && accept.contains("application/json")) {
            List<OfertasRequest> valor2 = userRepository.findByValor(valor);
            if ( !valor2.isEmpty()) { 
            	JsonApiBodyRequest body1 = new JsonApiBodyRequest();
            	body1.setOfertas(valor2);
            	return new ResponseEntity<JsonApiBodyRequest>(body1, HttpStatus.OK);
            } else { 
            	responseErrors.setCodigo("992018");
            	responseErrors.setDetalle("NO SE ENCONTRÓ EL VALOR DIGITADO");
            	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
            }
        } else { 
        	responseErrors.setCodigo("00");
        	responseErrors.setDetalle("ERROR HEADERS.");
        	return new ResponseEntity<JsonApiBodyResponseErrors>(responseErrors, HttpStatus.FAILED_DEPENDENCY);
        }
    }

}
