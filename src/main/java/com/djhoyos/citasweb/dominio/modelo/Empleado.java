package com.djhoyos.citasweb.dominio.modelo;

import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.dominio.utilidades.Validaciones;

public class Empleado {
    private long id;
    private int porcentaje;
    private Persona persona;
    private boolean estado;
    
    public Empleado() {
    }

    public Empleado(long id, int porcentaje, Persona persona, boolean estado) {
        Validaciones.validarNoVacio(persona, "El campo persona no puede estar vacio");
        Validaciones.menorIgualCero(porcentaje, "El porcentaje no puede ser cero o negativo");
        this.id = id;
        this.porcentaje = porcentaje;
        this.persona = persona;
        this.estado = estado;
    }

    public Empleado(long id, int porcentaje, ComandoPersona persona, boolean estado) {
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
