package com.djhoyos.citasweb.dominio.servicio.cita;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioCita;

public class ServicioEliminarCita {
    private final RepositorioCita repositorio;

    public ServicioEliminarCita(RepositorioCita repositorio) {
        this.repositorio = repositorio;
    }

    public void eliminar(long id){
        repositorio.eliminar(id);
    }
}
