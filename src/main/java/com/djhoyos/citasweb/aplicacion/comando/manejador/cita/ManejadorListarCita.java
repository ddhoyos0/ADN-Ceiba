package com.djhoyos.citasweb.aplicacion.comando.manejador.cita;

import java.util.List;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.dominio.modelo.Cita;
import com.djhoyos.citasweb.dominio.servicio.cita.ServicioListarCita;

@Component
public class ManejadorListarCita {
    private final ServicioListarCita servicio;

    public ManejadorListarCita(ServicioListarCita servicio) {
        this.servicio = servicio;
    }

    public List<Cita> ejecutar() {
        return servicio.listar();
    }

    public List<Cita> listEstado(boolean estado){return servicio.listEstado(estado);}

}
