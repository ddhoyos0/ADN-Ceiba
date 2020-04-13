package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;


import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value="empleados")
public class EmpleadoEntity {
	@Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private long id;
    private int porcentaje;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private PersonaEntity persona;
    
    private boolean estado;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public PersonaEntity getPersona() {
		return persona;
	}

	public void setPersona(PersonaEntity persona) {
		this.persona = persona;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
