package com.djhoyos.citasweb.dominio.repositorio;


import java.util.List;

import com.djhoyos.citasweb.dominio.modelo.Cita;

public interface RepositorioCita {
    Cita crear(Cita cita);
    List<Cita> listar();
    List<Cita> findByEstado(boolean estado);
    void eliminar(long id);   
}
