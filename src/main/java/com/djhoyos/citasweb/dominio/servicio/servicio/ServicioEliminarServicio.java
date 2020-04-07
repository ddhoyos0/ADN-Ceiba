package com.djhoyos.citasweb.dominio.servicio.servicio;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioServicio;

public class ServicioEliminarServicio {
    private final RepositorioServicio repositorio;

    public ServicioEliminarServicio(RepositorioServicio repositorio) {
        this.repositorio = repositorio;
    }

    public void eliminar(long id){
        repositorio.eliminar(id);
    }
}
