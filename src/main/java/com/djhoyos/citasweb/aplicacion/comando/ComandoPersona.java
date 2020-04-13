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

	public void setId(long id) {
		this.id = id;
	}

	public Identificacion getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Identificacion identificacion) {
		this.identificacion = identificacion;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
    
    

}
