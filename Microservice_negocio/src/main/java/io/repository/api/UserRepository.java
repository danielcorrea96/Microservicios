package io.repository.api;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import io.swagger.model.RegistrarRequest;

@EnableScan
public interface UserRepository extends CrudRepository<RegistrarRequest, String>{
		public List<RegistrarRequest> findByCorreoEmpresa(String correo_empresa);
		public List<RegistrarRequest> findByIdAdmin(String id_admin);
		public List<RegistrarRequest> findByIdNegocio(String id_negocio);
		public List<RegistrarRequest> findByNombreEmpresa(String nombre_empresa);		
}
