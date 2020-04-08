package com.djhoyos.citasweb.aplicacion.comando.manejador.persona;

import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaPersona;
import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.servicio.persona.ServicioCrearPersona;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearPersona {

    private final ServicioCrearPersona servicio;
    
    public ManejadorCrearPersona(ServicioCrearPersona servicio) {
        this.servicio = servicio;
    }

    public Persona ejecutar(ComandoPersona comandoPersona) {
        return servicio.crear( FabricaPersona.modelo(comandoPersona));
    }
}
