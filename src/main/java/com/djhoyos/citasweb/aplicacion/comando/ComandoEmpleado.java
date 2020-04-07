package com.djhoyos.citasweb.aplicacion.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ComandoEmpleado{	
    private long id;
    private int porcentaje;
    private ComandoPersona persona;    
    private boolean estado;

}
