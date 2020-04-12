package com.djhoyos.citasweb.aplicacion.comando.manejador.cita;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoCita;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaCita;
import com.djhoyos.citasweb.dominio.servicio.cita.ServicioActualizarCita;

@Component
public class ManejadorActualizarCita {
    private final ServicioActualizarCita servicio;
    public ManejadorActualizarCita(ServicioActualizarCita servicio) {
        this.servicio = servicio;
    }

    public void actualiza(ComandoCita comando) {     
        this.servicio.actualizar(FabricaCita.modelo(comando));
    }
}
