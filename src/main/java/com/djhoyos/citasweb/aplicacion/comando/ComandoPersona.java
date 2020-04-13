package com.djhoyos.citasweb.aplicacion.comando;

import com.djhoyos.citasweb.dominio.modelo.Identificacion;

public class ComandoPersona { 
    private long id;
    private Identificacion identificacion;
    private String documento;
    private String nombre;
    private String celular;
    private String direccion;
    private String email;
    private boolean estado;
    
	public ComandoPersona(long id, Identificacion identificacion, String documento, String nombre, String celular,
			String direccion, String email) {
		this.id = id;
		this.identificacion = identificacion;
		this.documento = documento;
		this.nombre = nombre;
		this.celular = celular;
		this.direccion = direccion;
		this.email = email;
	}

	public ComandoPersona() {
	}

	public long getId() {
		return id;
	}
	
	public Identificacion getIdentificacion() {
		return identificacion;
	}

	public String getDocumento() {
		return documento;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getCelular() {
		return celular;
	}

	public String getDireccion() {
		return direccion;
	}	

	public String getEmail() {
		return email;
	}

	public boolean isEstado() {
		return estado;
	}
   

}
