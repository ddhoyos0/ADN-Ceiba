package com.djhoyos.citasweb.aplicacion.comando.manejador.servicio;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaServicio;
import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioCrearServicio;

@Component
public class ManejadorCrearServicio {
    private final ServicioCrearServicio servicio;
    public ManejadorCrearServicio(ServicioCrearServicio servicio) {
        this.servicio = servicio;
    }

    public void crear(ComandoServicio comando) {    
        this.servicio.crear(FabricaServicio.modelo(comando));
    }
}
