package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.PersonaEntity;

public interface RepositorioPersonaJpa extends JpaRepository<PersonaEntity, Long> {
	@Query(name = "SELECT u FROM personas u WHERE u.estado = ?1", nativeQuery = true)
	List<PersonaEntity> findByEstado(boolean estado);

	@Transactional
	@Modifying
	@Query(value = "UPDATE personas SET estado = ? WHERE id = ?", nativeQuery = true)
	void updatePersonaSetEstadoForId(boolean estado, long id);

}
