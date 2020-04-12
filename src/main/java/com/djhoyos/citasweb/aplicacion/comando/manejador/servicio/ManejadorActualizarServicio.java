package com.djhoyos.citasweb.aplicacion.comando.manejador.servicio;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaServicio;
import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioActualizarServicio;

@Component
public class ManejadorActualizarServicio {
    private final ServicioActualizarServicio servicio;
    public ManejadorActualizarServicio(ServicioActualizarServicio servicio) {
        this.servicio = servicio;
    }

    public void actualiza(ComandoServicio comando) {
        this.servicio.actualizar(FabricaServicio.modelo(comando));
    }
}
