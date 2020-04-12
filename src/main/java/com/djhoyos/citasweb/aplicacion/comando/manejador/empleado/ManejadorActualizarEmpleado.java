package com.djhoyos.citasweb.aplicacion.comando.manejador.empleado;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaEmpleado;
import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioActualizarEmpleado;

@Component
public class ManejadorActualizarEmpleado {
    private final ServicioActualizarEmpleado servicio;
    public ManejadorActualizarEmpleado(ServicioActualizarEmpleado servicio) {
        this.servicio = servicio;
    }

    public void actualiza(ComandoEmpleado comando) {
        this.servicio.actualizar(FabricaEmpleado.modelo(comando));
    }
}
