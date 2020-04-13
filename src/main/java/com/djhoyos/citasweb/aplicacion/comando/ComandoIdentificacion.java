package com.djhoyos.citasweb.aplicacion.comando;

public class ComandoIdentificacion {
	private long id;
    private String tipo;   
    

	public ComandoIdentificacion() {}
	
	public ComandoIdentificacion(long id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}	

	public long getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}	   
    
}
