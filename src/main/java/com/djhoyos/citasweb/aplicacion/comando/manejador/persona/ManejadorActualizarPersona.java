package com.djhoyos.citasweb.aplicacion.comando.manejador.persona;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaPersona;
import com.djhoyos.citasweb.dominio.servicio.persona.ServicioActualizarPersona;

@Component
public class ManejadorActualizarPersona {
    private final ServicioActualizarPersona servicio;
    public ManejadorActualizarPersona(ServicioActualizarPersona servicio) {
        this.servicio = servicio;
    }

    public void actualiza(ComandoPersona comandoPersona) {
        servicio.actualizar(FabricaPersona.modelo(comandoPersona));
    }
}
