package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ventas")
public class VentaEntity {
  
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDate fecha;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private CitaEntity cita;

    @Column
    private int utilidad;

    @Column
    private int comision;

    @Column
    private int total;

    private boolean estado;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public CitaEntity getCita() {
		return cita;
	}

	public void setCita(CitaEntity cita) {
		this.cita = cita;
	}

	public int getUtilidad() {
		return utilidad;
	}

	public void setUtilidad(int utilidad) {
		this.utilidad = utilidad;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
    
    
}
