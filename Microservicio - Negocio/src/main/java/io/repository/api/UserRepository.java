package io.repository.api;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import io.swagger.model.RegistrarRequest;

@EnableScan
public interface UserRepository extends CrudRepository<RegistrarRequest, String>{
	public List<RegistrarRequest> findByIdadmin(String idAdmin);
	public List<RegistrarRequest> findByIdnegocio( String idnegocio);
	public List<RegistrarRequest> findByTiponegocio( String tipoNegocio);

}
