package com.djhoyos.citasweb.aplicacion.comando;

import java.time.LocalDateTime;

import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.modelo.Servicio;

public class ComandoCita{
	
    private long id;
    private LocalDateTime fecha;
    private Persona persona;
    private Empleado empleado;
    private Servicio servicio;
    private boolean estado;
    
    public ComandoCita() {
	}

	public ComandoCita(long id, LocalDateTime fecha, Persona persona, Empleado empleado, Servicio servicio,
			boolean estado) {
		this.id = id;
		this.fecha = fecha;
		this.persona = persona;
		this.empleado = empleado;
		this.servicio = servicio;
		this.estado = estado;
	}

	public long getId() {
		return id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public Persona getPersona() {
		return persona;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public boolean isEstado() {
		return estado;
	}
	
}
