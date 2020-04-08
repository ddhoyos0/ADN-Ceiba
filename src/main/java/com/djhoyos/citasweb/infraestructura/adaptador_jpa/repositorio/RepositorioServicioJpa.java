package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.ServicioEntity;

public interface RepositorioServicioJpa extends JpaRepository<ServicioEntity, Long> {
	@Query(name = "SELECT u FROM servicios u WHERE u.estado = ?1", nativeQuery = true)
	List<ServicioEntity> findByEstado(boolean estado);

	@Transactional
	@Modifying
	@Query(value = "UPDATE servicios SET estado = ? WHERE id = ?", nativeQuery = true)
	void updateServicioSetEstadoForId(boolean estado, long id);
}
