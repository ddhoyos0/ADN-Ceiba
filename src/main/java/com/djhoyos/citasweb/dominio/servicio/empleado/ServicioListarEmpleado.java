package com.djhoyos.citasweb.dominio.servicio.empleado;

import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioEmpleado;

import java.util.List;

public class ServicioListarEmpleado {
    private final RepositorioEmpleado repositorio;

    public ServicioListarEmpleado(RepositorioEmpleado repositorio) {
        this.repositorio = repositorio;
    }

    public List<Empleado> listar(){
        return repositorio.listar();
    }
}
