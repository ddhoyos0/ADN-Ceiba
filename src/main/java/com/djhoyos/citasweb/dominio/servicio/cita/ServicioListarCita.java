package com.djhoyos.citasweb.dominio.servicio.cita;


import java.util.List;

import com.djhoyos.citasweb.dominio.modelo.Cita;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioCita;

public class ServicioListarCita {
    private final RepositorioCita repositorio;

    public ServicioListarCita(RepositorioCita repositorio) {
        this.repositorio = repositorio;
    }

    public List<Cita> listar(){
        return repositorio.listar();
    }

    public List<Cita> listEstado(boolean estado){return repositorio.findByEstado(estado);}
    
}
