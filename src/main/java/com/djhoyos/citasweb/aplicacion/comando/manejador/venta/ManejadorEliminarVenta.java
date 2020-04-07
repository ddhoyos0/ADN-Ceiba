package com.djhoyos.citasweb.aplicacion.comando.manejador.venta;

import com.djhoyos.citasweb.dominio.servicio.venta.ServicioEliminarVenta;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarVenta {

    private final ServicioEliminarVenta servicio;

    public ManejadorEliminarVenta(ServicioEliminarVenta servicio) {
        this.servicio = servicio;
    }

    public void eliminar(long id){
        this.servicio.eliminar(id);
    }
}
