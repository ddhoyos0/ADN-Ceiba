package com.djhoyos.citasweb.dominio.servicio.empleado;

import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioEmpleado;

public class ServicioActualizarEmpleado {
    private final RepositorioEmpleado repositorio;

    public ServicioActualizarEmpleado(RepositorioEmpleado repositorio) {
        this.repositorio = repositorio;
    }

    public void actualizar(Empleado empleado){
        repositorio.crear(empleado);
    }
}
