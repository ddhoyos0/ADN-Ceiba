package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.EmpleadoEntity;

public interface RepositorioEmpleadoJpa extends JpaRepository<EmpleadoEntity, Long> {
	@Query(name = "SELECT u FROM empleado_entity u WHERE u.estado = ?1", nativeQuery = true)
	List<EmpleadoEntity> findByEstado(boolean estado);

	@Transactional
	@Modifying
	@Query(value = "UPDATE empleado_entity SET estado = ? WHERE id = ?", nativeQuery = true)
	void updateEmpleadoSetEstadoForId(boolean estado, long id);
}
