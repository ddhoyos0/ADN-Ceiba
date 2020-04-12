package com.djhoyos.citasweb.dominio.servicio.persona;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioPersona;

public class ServicioEliminaPersona {

    private final RepositorioPersona repositorio;

    public ServicioEliminaPersona(RepositorioPersona repositorio) {
        this.repositorio = repositorio;
    }

    public void eliminar(Integer id){
        repositorio.eliminar(id);
    }
}
