package com.djhoyos.citasweb.dominio.repositorio;

import java.util.List;

import com.djhoyos.citasweb.dominio.modelo.Identificacion;

public interface RepositorioIdentificacion {
	void crear(Identificacion identificacion);

	List<Identificacion> listar();
}
