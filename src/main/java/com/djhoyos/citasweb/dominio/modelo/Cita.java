package com.djhoyos.citasweb.dominio.modelo;

import java.time.LocalDateTime;

import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.dominio.utilidades.Validaciones;

public class Cita {
    private long id;
    private LocalDateTime fecha;
    private Persona persona;
    private Empleado empleado;
    private Servicio servicio;
    private boolean estado;


    public Cita(long id, LocalDateTime fecha, Persona persona, Empleado empleado, Servicio servicio, boolean estado) {
        Validaciones.validarNoVacio(fecha, " La fecha no puede estar vacia");
        Validaciones.validarFechaAnterior(fecha, "La fecha no puede ser menor a la actual");
        Validaciones.validarNoVacio(persona, "El campo persona no puede ser vacio");
        Validaciones.validarNoVacio(empleado, "El campo empleado no puede ser vacio");
        Validaciones.validarNoVacio(servicio, "El campo de servicio no puede ser vacio");
        this.id = id;
        this.fecha = fecha;
        this.persona = persona;
        this.empleado = empleado;
        this.servicio = servicio;
        this.estado = estado;
    }

    public Cita() {

    }

    public Cita(long id, LocalDateTime fecha, ComandoPersona persona, ComandoEmpleado empleado,
			ComandoServicio servicio, boolean estado) {
    	
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
