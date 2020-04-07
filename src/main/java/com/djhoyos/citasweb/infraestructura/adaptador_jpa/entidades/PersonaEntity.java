package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "personas")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaEntity{
	@Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private long id;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private DocumentoEntity tipo_documento;

    private String documento;;

    private String nombre;

    private String celular;

    private String direccion;

    private String email;
    
    private boolean estado;

}
