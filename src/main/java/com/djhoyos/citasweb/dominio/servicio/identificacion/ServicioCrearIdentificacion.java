package com.djhoyos.citasweb.dominio.servicio.identificacion;

import com.djhoyos.citasweb.dominio.modelo.Identificacion;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioIdentificacion;

public class ServicioCrearIdentificacion {
	
    private final RepositorioIdentificacion repositorio;

    public ServicioCrearIdentificacion(RepositorioIdentificacion repositorio) {
        this.repositorio = repositorio;
    }

    public void crear(Identificacion cita) {      	
        this.repositorio.crear(cita);
    } 
}
