package com.djhoyos.citasweb.aplicacion.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoServicio {
    private long id;
    private String tipo;
    private int precio;
    private boolean estado;
    
}
