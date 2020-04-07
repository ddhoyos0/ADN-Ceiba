package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio;

import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.DocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioDocumentoJpa extends JpaRepository<DocumentoEntity,Integer> {
}
