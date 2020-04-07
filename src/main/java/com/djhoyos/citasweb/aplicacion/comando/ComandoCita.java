package com.djhoyos.citasweb.aplicacion.comando;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ComandoCita{	
    private long id;
    private LocalDateTime fecha;
    private ComandoPersona persona;
    private ComandoEmpleado empleado;
    private ComandoServicio servicio;
    private boolean estado;   
 
}
