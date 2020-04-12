package com.djhoyos.citasweb.dominio.repositorio;

import java.util.List;

import com.djhoyos.citasweb.dominio.modelo.Servicio;

public interface RepositorioServicio {
	void crear(Servicio servicio);

	List<Servicio> listar();

	void eliminar(long id);
}
