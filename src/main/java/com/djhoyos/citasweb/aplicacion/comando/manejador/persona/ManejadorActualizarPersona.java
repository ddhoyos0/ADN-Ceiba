package com.djhoyos.citasweb.aplicacion.comando.manejador.persona;

import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaPersona;
import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.servicio.persona.ServicioActualizarPersona;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarPersona {
    private final ServicioActualizarPersona servicio;
    public ManejadorActualizarPersona(ServicioActualizarPersona servicio) {
        this.servicio = servicio;
    }

    public void actualiza(ComandoPersona comandoPersona) {
        Persona persona = FabricaPersona.modelo(comandoPersona);
        servicio.actualizar(persona);
    }
}
