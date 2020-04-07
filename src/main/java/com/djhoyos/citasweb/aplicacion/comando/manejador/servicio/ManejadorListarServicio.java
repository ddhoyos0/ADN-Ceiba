package com.djhoyos.citasweb.aplicacion.comando.manejador.servicio;

import com.djhoyos.citasweb.dominio.modelo.Servicio;
import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioListarServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarServicio {
    private final ServicioListarServicio servicio;

    public ManejadorListarServicio(ServicioListarServicio servicio) {
        this.servicio = servicio;
    }

    public List<Servicio> ejecutar() {
        return servicio.listar();
    }
}
