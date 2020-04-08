package com.djhoyos.citasweb.aplicacion.comando.manejador.servicio;

import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaServicio;
import com.djhoyos.citasweb.dominio.modelo.Servicio;
import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioActualizarServicio;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarServicio {
    private final ServicioActualizarServicio servicio;
    public ManejadorActualizarServicio(ServicioActualizarServicio servicio) {
        this.servicio = servicio;
    }

    public Servicio actualiza(ComandoServicio comando) {
        return this.servicio.actualizar(FabricaServicio.modelo(comando));
    }
}
