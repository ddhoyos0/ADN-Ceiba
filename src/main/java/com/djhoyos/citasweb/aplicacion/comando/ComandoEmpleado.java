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

	public void setId(long id) {
		this.id = id;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
