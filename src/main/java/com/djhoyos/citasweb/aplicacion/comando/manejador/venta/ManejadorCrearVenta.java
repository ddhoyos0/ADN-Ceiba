package com.djhoyos.citasweb.aplicacion.comando.manejador.venta;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoVenta;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaVenta;
import com.djhoyos.citasweb.dominio.modelo.Venta;
import com.djhoyos.citasweb.dominio.servicio.venta.ServicioCrearVenta;

@Component
public class ManejadorCrearVenta {
    private final ServicioCrearVenta servicio;
    public ManejadorCrearVenta(ServicioCrearVenta servicio) {
        this.servicio = servicio;
    }

    public Venta crear(ComandoVenta comando) {
        Venta venta = FabricaVenta.modelo(comando);
        return this.servicio.crear(venta);
    }
}
