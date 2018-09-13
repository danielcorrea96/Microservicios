package io.repository.api;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import io.swagger.model.OfertasRequest;



@EnableScan
public interface UserRepository extends CrudRepository<OfertasRequest, String>{
	public List<OfertasRequest> findByDescuento(String descuento);
	public List<OfertasRequest> findByFechainicio(String fechai);
	public List<OfertasRequest> findByFechafinal(String fechaf);
	public List<OfertasRequest> findById(String id);
	public List<OfertasRequest> findByProducto(String producto);
	public List<OfertasRequest> findByValor(String valor);
	public List<OfertasRequest> findByIdnegocio(String idnegocio);
	public List<OfertasRequest> findByTipodeoferta(String tipodeoferta);
	public List<OfertasRequest> findByIdnegocioAndTipodeoferta(String idnegocio, String tipodeoferta);
	
}

