package com.djhoyos.citasweb.aplicacion.comando;

public class ComandoServicio {
    private long id;
    private String tipo;
    private int precio;
    private boolean estado;
    
    
	public ComandoServicio() {
	}

	public ComandoServicio(long id, String tipo, int precio, boolean estado) {
		this.id = id;
		this.tipo = tipo;
		this.precio = precio;
		this.estado = estado;
	}

	public long getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}
	
	public int getPrecio() {
		return precio;
	}

	public boolean isEstado() {
		return estado;
	}
    
}
