package com.djhoyos.citasweb.aplicacion.comando.manejador.identificacion;

import java.util.List;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.dominio.modelo.Identificacion;
import com.djhoyos.citasweb.dominio.servicio.identificacion.ServicioListarIdentificacion;

@Component
public class ManejadorListarIdentificacion {

	private final ServicioListarIdentificacion servicio;

	public ManejadorListarIdentificacion(ServicioListarIdentificacion servicio) {
	        this.servicio = servicio;
	    }

	public List<Identificacion> ejecutar() {
		return servicio.listar();
	}

}
