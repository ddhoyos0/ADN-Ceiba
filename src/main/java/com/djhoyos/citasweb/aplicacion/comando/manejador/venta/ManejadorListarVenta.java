package com.djhoyos.citasweb.aplicacion.comando.manejador.venta;

import com.djhoyos.citasweb.dominio.modelo.Venta;
import com.djhoyos.citasweb.dominio.servicio.venta.ServicioListarVenta;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarVenta {

    private ServicioListarVenta servicio;

    public ManejadorListarVenta(ServicioListarVenta servicio) {
        this.servicio = servicio;
    }

    public List<Venta> listar() {
        return servicio.listar();
    }
}
