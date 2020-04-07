package com.djhoyos.citasweb.dominio.servicio.empleado;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioEmpleado;

public class ServicioEliminarEmpleado {
    private final RepositorioEmpleado repositorio;

    public ServicioEliminarEmpleado(RepositorioEmpleado repositorio) {
        this.repositorio = repositorio;
    }

    public void eliminar(long id){
        repositorio.eliminar(id);
    }
}
