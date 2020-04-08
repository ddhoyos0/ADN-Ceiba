package com.djhoyos.citasweb.aplicacion.comando.manejador.cita;

import com.djhoyos.citasweb.aplicacion.comando.ComandoCita;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaCita;
import com.djhoyos.citasweb.dominio.modelo.Cita;
import com.djhoyos.citasweb.dominio.servicio.cita.ServicioActualizarCita;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarCita {
    private final ServicioActualizarCita servicio;
    public ManejadorActualizarCita(ServicioActualizarCita servicio) {
        this.servicio = servicio;
    }

    public Cita actualiza(ComandoCita comando) {     
        return this.servicio.actualizar(FabricaCita.modelo(comando));
    }
}
