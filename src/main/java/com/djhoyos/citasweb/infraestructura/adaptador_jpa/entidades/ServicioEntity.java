package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "servicios")
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServicioEntity {
   
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String tipo;

    private int precio;
    
    private boolean estado;
}
