package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.VentaEntity;

public interface RepositorioVentaJpa extends JpaRepository<VentaEntity, Long> {
	@Query(name = "SELECT u FROM ventas u WHERE u.estado = ?1", nativeQuery = true)
	List<VentaEntity> findByEstado(boolean estado);

	@Transactional
	@Modifying
	@Query(value = "UPDATE ventas SET estado = ? WHERE id = ?", nativeQuery = true)
	void updateVentaSetEstadoForId(boolean estado, long id);
}
