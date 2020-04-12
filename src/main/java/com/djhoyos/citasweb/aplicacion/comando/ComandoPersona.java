package com.djhoyos.citasweb.aplicacion.comando;

import com.djhoyos.citasweb.dominio.modelo.Identificacion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoPersona { 
    private long id;
    private Identificacion identificacion;
    private String documento;
    private String nombre;
    private String celular;
    private String direccion;
    private String email;
    private boolean estado;

}
