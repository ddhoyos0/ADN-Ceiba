package com.djhoyos.citasweb.aplicacion.comando.manejador.cita;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoCita;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaCita;
import com.djhoyos.citasweb.dominio.modelo.Cita;
import com.djhoyos.citasweb.dominio.servicio.cita.ServicioCrearCita;

@Component
public class ManejadorCrearCita {
    private final ServicioCrearCita servicio;
    public ManejadorCrearCita(ServicioCrearCita servicio) {
        this.servicio = servicio;
    }

    public Cita crear(ComandoCita comando) {  
        return this.servicio.crear(FabricaCita.modelo(comando));
    }
}
