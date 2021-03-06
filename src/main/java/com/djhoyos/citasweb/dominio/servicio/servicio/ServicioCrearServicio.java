package com.djhoyos.citasweb.dominio.servicio.servicio;

import com.djhoyos.citasweb.dominio.modelo.Servicio;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioServicio;

public class ServicioCrearServicio {
    private final RepositorioServicio repositorio;

    public ServicioCrearServicio(RepositorioServicio repositorio) {
        this.repositorio = repositorio;
    }

    public void crear(Servicio servicio) {
        this.repositorio.crear(servicio);
    }
}
