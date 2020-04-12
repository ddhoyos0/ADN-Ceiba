package com.djhoyos.citasweb.dominio.servicio.servicio;

import com.djhoyos.citasweb.dominio.modelo.Servicio;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioServicio;

public class ServicioActualizarServicio {
    private final RepositorioServicio repositorio;

    public ServicioActualizarServicio(RepositorioServicio repositorio) {
        this.repositorio = repositorio;
    }

    public void actualizar(Servicio servicio){
       repositorio.crear(servicio);
    }
}
