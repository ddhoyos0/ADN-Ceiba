package com.djhoyos.citasweb.aplicacion.comando.manejador.persona;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.dominio.servicio.persona.ServicioEliminaPersona;

@Component
public class ManejadorEliminarPersona {

    private final ServicioEliminaPersona servicio;
    public ManejadorEliminarPersona(ServicioEliminaPersona servicio) {
        this.servicio = servicio;
    }

    public void eliminar(Integer id) {
        servicio.eliminar(id);
    }
}
