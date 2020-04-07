package com.djhoyos.citasweb.dominio.servicio.persona;

import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioPersona;

import java.util.List;

public class ServicioListarPersona {

    private final RepositorioPersona repositorio;

    public ServicioListarPersona(RepositorioPersona repositorio) {
        this.repositorio = repositorio;
    }


    public List<Persona> ejecutar(){
        return repositorio.listar();
    }
}
