package com.djhoyos.citasweb.aplicacion.comando;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoVenta {
	
    private long id;
    private LocalDate fecha;
    private ComandoCita cita;
    private int utilidad;
    private int comision;
    private int total;
    private boolean estado;

}
