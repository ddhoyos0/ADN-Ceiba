package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ventas")
@Data
public class VentaEntity {
  
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDate fecha;

    @ManyToOne( cascade = CascadeType.REFRESH)
    private CitaEntity cita;

    @Column
    private int utilidad;

    @Column
    private int comision;

    @Column
    private int total;

    private boolean estado;
}
