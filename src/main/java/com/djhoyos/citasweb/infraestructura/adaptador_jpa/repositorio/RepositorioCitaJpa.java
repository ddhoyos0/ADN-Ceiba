package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.CitaEntity;

public interface RepositorioCitaJpa extends JpaRepository<CitaEntity,Long> {
    @Query(name = "SELECT u FROM citas u WHERE u.estado = ?1", nativeQuery = true)
    List<CitaEntity> findByEstado(boolean estado);
    
    @Transactional
    @Modifying
    @Query(value = "UPDATE citas SET estado = ? WHERE id = ?", nativeQuery = true)
    void updateCitaSetEstadoForId(boolean estado, long id);

}
