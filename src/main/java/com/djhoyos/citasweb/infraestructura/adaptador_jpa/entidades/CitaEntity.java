package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "citas")
public class CitaEntity{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDateTime fecha;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private PersonaEntity persona;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private EmpleadoEntity empleado;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private ServicioEntity servicio;

    private boolean estado;

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

	public PersonaEntity getPersona() {
		return persona;
	}

	public void setPersona(PersonaEntity persona) {
		this.persona = persona;
	}

	public EmpleadoEntity getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoEntity empleado) {
		this.empleado = empleado;
	}

	public ServicioEntity getServicio() {
		return servicio;
	}

	public void setServicio(ServicioEntity servicio) {
		this.servicio = servicio;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}   


}
