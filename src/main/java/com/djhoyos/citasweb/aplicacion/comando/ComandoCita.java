package com.djhoyos.citasweb.aplicacion.comando;

import java.time.LocalDateTime;

import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.modelo.Servicio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ComandoCita{	
    private long id;
    private LocalDateTime fecha;
    private Persona persona;
    private Empleado empleado;
    private Servicio servicio;
    private boolean estado; 
    
 
}
