package com.djhoyos.citasweb.dominio.modelo;

import com.djhoyos.citasweb.dominio.utilidades.Validaciones;

public class Identificacion {
    private long id;
    private String tipo;

    public Identificacion() {
    }

    public Identificacion(long id, String tipo) {
        Validaciones.validarNoVacio(tipo,"El tipo de documento no puede ser vacio");
        this.id = id;
        this.tipo = tipo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
