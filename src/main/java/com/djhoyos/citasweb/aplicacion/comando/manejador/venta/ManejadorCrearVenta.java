package com.djhoyos.citasweb.aplicacion.comando.manejador.venta;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoVenta;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaVenta;
import com.djhoyos.citasweb.dominio.servicio.venta.ServicioCrearVenta;

@Component
public class ManejadorCrearVenta {
    private final ServicioCrearVenta servicio;
    public ManejadorCrearVenta(ServicioCrearVenta servicio) {
        this.servicio = servicio;
    }

    public void crear(ComandoVenta comando) {
        this.servicio.crear(FabricaVenta.modelo(comando));
    }
}
