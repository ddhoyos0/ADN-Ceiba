package com.djhoyos.citasweb.dominio.servicio.identificacion;

import java.util.List;

import com.djhoyos.citasweb.dominio.modelo.Identificacion;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioIdentificacion;

public class ServicioListarIdentificacion {

	private final RepositorioIdentificacion repositorio;

	public ServicioListarIdentificacion(RepositorioIdentificacion repositorio) {
	        this.repositorio = repositorio;
	    }

	public List<Identificacion> listar() {
		return repositorio.listar();
	}
}
