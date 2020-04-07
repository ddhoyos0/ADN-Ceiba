package com.djhoyos.citasweb.aplicacion.comando.manejador.empleado;

import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaEmpleado;
import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioActualizarEmpleado;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarEmpleado {
    private final ServicioActualizarEmpleado servicio;
    public ManejadorActualizarEmpleado(ServicioActualizarEmpleado servicio) {
        this.servicio = servicio;
    }

    public Empleado actualiza(ComandoEmpleado comando) {
        Empleado empleado = FabricaEmpleado.modelo(comando);
        return this.servicio.actualizar(empleado);
    }
}
