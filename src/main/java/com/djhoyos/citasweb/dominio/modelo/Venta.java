package com.djhoyos.citasweb.dominio.modelo;

import java.time.LocalDate;

import com.djhoyos.citasweb.dominio.utilidades.Validaciones;

public class Venta {
    private long id;
    private LocalDate fecha;
    private Cita cita;
    private int utilidad;
    private int comision;
    private int total;
    private boolean estado;

    public Venta() {
    }

    public Venta(long id, LocalDate fecha, Cita cita, int utilidad, int comision, int total, boolean estado) {
        Validaciones.validarNoVacio(cita, " El campo cita no puede ser estar vacio");
        this.id = id;
        this.fecha = fecha;
        this.cita = cita;
        this.utilidad = utilidad;
        this.comision = comision;
        this.total = total;
        this.estado = estado;
    }

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

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
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
