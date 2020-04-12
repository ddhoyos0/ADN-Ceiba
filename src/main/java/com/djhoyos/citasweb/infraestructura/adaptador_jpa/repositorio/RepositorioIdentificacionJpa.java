package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.IdentificacionEntity;

public interface RepositorioIdentificacionJpa extends JpaRepository<IdentificacionEntity,Integer>{

}
