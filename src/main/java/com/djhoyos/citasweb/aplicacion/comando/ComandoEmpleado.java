package com.djhoyos.citasweb.aplicacion.comando;

import com.djhoyos.citasweb.dominio.modelo.Persona;

public class ComandoEmpleado{	
    private long id;
    private int porcentaje;
    private Persona persona;    
    private boolean estado;
    
	public ComandoEmpleado(long id, int porcentaje, Persona persona, boolean estado) {		
		this.id = id;
		this.porcentaje = porcentaje;
		this.persona = persona;
		this.estado = estado;
	}

	public ComandoEmpleado() {		
	}

	public long getId() {
		return id;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public Persona getPersona() {
		return persona;
	}

	public boolean isEstado() {
		return estado;
	}

}
