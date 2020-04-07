package com.djhoyos.citasweb.dominio.modelo;

import com.djhoyos.citasweb.dominio.utilidades.Validaciones;

public class Servicio {
    private long id;
    private String tipo;
    private int precio;
    private boolean estado;
    
    public Servicio() {
    }

    public Servicio(long id, String tipo, int precio, boolean estado) {
        Validaciones.validarNoVacio(tipo, "El tipo de servicio no puede ser vacio");
        Validaciones.menorIgualCero(precio, "El precio no puede ser menor o igual a cero ");
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
    
}
