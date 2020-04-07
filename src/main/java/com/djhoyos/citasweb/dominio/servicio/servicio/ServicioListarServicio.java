package com.djhoyos.citasweb.dominio.servicio.servicio;

import com.djhoyos.citasweb.dominio.modelo.Servicio;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioServicio;

import java.util.List;

public class ServicioListarServicio {
    private final RepositorioServicio repositorio;

    public ServicioListarServicio(RepositorioServicio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Servicio> listar(){
        return repositorio.listar();
    }
}
