package com.djhoyos.citasweb.dominio.servicio.cita;

import com.djhoyos.citasweb.dominio.modelo.Cita;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioCita;

public class ServicioActualizarCita {
    private final RepositorioCita repositorio;

    public ServicioActualizarCita(RepositorioCita repositorio) {
        this.repositorio = repositorio;
    }

    public void actualizar(Cita cita){
        repositorio.crear(cita);
    }

}
