package com.djhoyos.citasweb.aplicacion.comando.manejador.persona;

import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.servicio.persona.ServicioListarPersona;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarPersona {
    private final ServicioListarPersona servicio;

    public ManejadorListarPersona(ServicioListarPersona servicio) {
        this.servicio = servicio;
    }

    public List<Persona> ejecutar() {
        return servicio.ejecutar();
    }


}
