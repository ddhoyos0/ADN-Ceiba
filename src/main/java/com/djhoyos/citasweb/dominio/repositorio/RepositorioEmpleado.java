package com.djhoyos.citasweb.dominio.repositorio;

import com.djhoyos.citasweb.dominio.modelo.Empleado;

import java.util.List;

public interface RepositorioEmpleado {
    void crear(Empleado empleado);
    List<Empleado> listar();
    void eliminar(long id);
    
}
