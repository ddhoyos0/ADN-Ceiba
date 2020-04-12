package com.djhoyos.citasweb.aplicacion.comando.manejador.empleado;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaEmpleado;
import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioCrearEmpleado;

@Component
public class ManejadorCrearEmpleado {
    private final ServicioCrearEmpleado servicio;
    public ManejadorCrearEmpleado(ServicioCrearEmpleado servicio) {
        this.servicio = servicio;
    }

    public void crear(ComandoEmpleado comando) {
        this.servicio.crear(FabricaEmpleado.modelo(comando));
    }
}
