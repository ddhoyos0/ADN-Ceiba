package com.djhoyos.citasweb.aplicacion.comando.manejador.persona;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaPersona;
import com.djhoyos.citasweb.dominio.servicio.persona.ServicioCrearPersona;

@Component
public class ManejadorCrearPersona {

    private final ServicioCrearPersona servicio;
    
    public ManejadorCrearPersona(ServicioCrearPersona servicio) {
        this.servicio = servicio;
    }

    public void ejecutar(ComandoPersona comandoPersona) {
        servicio.crear( FabricaPersona.modelo(comandoPersona));
    }
}
