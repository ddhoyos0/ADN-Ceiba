package com.djhoyos.citasweb.aplicacion.comando.manejador.empleado;

import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaEmpleado;
import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioCrearEmpleado;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearEmpleado {
    private final ServicioCrearEmpleado servicio;
    public ManejadorCrearEmpleado(ServicioCrearEmpleado servicio) {
        this.servicio = servicio;
    }

    public Empleado crear(ComandoEmpleado comando) {
        Empleado empleado = FabricaEmpleado.modelo(comando);
        return this.servicio.crear(empleado);
    }
}
