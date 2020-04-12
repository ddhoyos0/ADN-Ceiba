package com.djhoyos.citasweb.aplicacion.comando;

import com.djhoyos.citasweb.dominio.modelo.Persona;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ComandoEmpleado{	
    private long id;
    private int porcentaje;
    private Persona persona;    
    private boolean estado;

}
