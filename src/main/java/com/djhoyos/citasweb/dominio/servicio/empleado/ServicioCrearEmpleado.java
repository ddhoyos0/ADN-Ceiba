package com.djhoyos.citasweb.dominio.servicio.empleado;

import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioEmpleado;

public class ServicioCrearEmpleado {
    private final RepositorioEmpleado repositorio;

    public ServicioCrearEmpleado(RepositorioEmpleado repositorio) {
        this.repositorio = repositorio;
    }

    public Empleado crear(Empleado empleado) {       
        return this.repositorio.crear(empleado);
    }

   
}
