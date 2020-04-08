package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import lombok.Data;

@Entity
@Table(name = "citas")
@Data
public class CitaEntity{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDateTime fecha;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private PersonaEntity persona;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private EmpleadoEntity empleado;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private ServicioEntity servicio;

    private boolean estado;   


}
