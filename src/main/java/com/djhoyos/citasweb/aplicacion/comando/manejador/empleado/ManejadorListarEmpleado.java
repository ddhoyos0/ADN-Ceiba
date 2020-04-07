package com.djhoyos.citasweb.aplicacion.comando.manejador.empleado;

import java.util.List;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioListarEmpleado;

@Component
public class ManejadorListarEmpleado {
    private final ServicioListarEmpleado servicio;

    public ManejadorListarEmpleado(ServicioListarEmpleado servicio) {
        this.servicio = servicio;
    }

    public List<Empleado> ejecutar() {
        return servicio.listar();
    }
}
