package com.djhoyos.citasweb.dominio.servicio.cita;

import com.djhoyos.citasweb.dominio.modelo.Cita;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioCita;

public class ServicioCrearCita {
		
    private final RepositorioCita repositorio;

    public ServicioCrearCita(RepositorioCita repositorio) {
        this.repositorio = repositorio;
    }

    public Cita crear(Cita cita) {      	
        return this.repositorio.crear(cita);
    } 
  
	

    
}

