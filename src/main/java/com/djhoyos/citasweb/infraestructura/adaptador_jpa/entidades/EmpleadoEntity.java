package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;


import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue(value="empleados")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoEntity {
	@Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private long id;
    private int porcentaje;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private PersonaEntity persona;
    
    private boolean estado;

}
