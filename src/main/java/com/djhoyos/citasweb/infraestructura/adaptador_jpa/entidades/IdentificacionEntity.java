package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "identificacion")
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
public class IdentificacionEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String tipo;
    
	public IdentificacionEntity(long id, String tipo) {}

	public IdentificacionEntity() {}

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
