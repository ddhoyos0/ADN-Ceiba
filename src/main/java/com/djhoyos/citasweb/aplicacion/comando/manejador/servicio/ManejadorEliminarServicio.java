package com.djhoyos.citasweb.aplicacion.comando.manejador.servicio;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioEliminarServicio;

@Component
public class ManejadorEliminarServicio {
    private final ServicioEliminarServicio servicio;
    public ManejadorEliminarServicio(ServicioEliminarServicio servicio) {
        this.servicio = servicio;
    }
    public void eliminar(long id){
        this.servicio.eliminar(id);
    }

}
