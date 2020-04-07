package com.djhoyos.citasweb.dominio.servicio.persona;

import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioPersona;

public class ServicioActualizarPersona {
    private final RepositorioPersona repositorio;

    public ServicioActualizarPersona(RepositorioPersona repositorio) {
        this.repositorio = repositorio;
    }

    public void actualizar(Persona persona){
       repositorio.actualizar(persona);
    }
}
