package com.djhoyos.citasweb.dominio.servicio.persona;

import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioPersona;

public class ServicioCrearPersona {

    private final RepositorioPersona repositorio;

    public ServicioCrearPersona(RepositorioPersona repositorio) {
        this.repositorio = repositorio;
    }

    public void crear(Persona persona) {  
       repositorio.crear(persona);
    }


}
