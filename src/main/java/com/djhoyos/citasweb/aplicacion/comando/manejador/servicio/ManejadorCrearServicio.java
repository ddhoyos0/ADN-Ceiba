package com.djhoyos.citasweb.aplicacion.comando.manejador.servicio;

import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaServicio;
import com.djhoyos.citasweb.dominio.modelo.Servicio;
import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioCrearServicio;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearServicio {
    private final ServicioCrearServicio servicio;
    public ManejadorCrearServicio(ServicioCrearServicio servicio) {
        this.servicio = servicio;
    }

    public Servicio crear(ComandoServicio comando) {
        Servicio servicio = FabricaServicio.modelo(comando);
        return this.servicio.crear(servicio);
    }
}
