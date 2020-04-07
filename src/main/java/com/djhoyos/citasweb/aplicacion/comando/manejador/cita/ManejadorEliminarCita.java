package com.djhoyos.citasweb.aplicacion.comando.manejador.cita;

import com.djhoyos.citasweb.dominio.servicio.cita.ServicioEliminarCita;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarCita {
    private final ServicioEliminarCita servicio;

    public ManejadorEliminarCita(ServicioEliminarCita servicio) {
        this.servicio = servicio;

    }
    public void eliminar(long id){
        this.servicio.eliminar(id);
    }

}
