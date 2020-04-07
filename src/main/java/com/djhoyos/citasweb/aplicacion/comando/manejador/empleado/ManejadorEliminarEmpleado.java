package com.djhoyos.citasweb.aplicacion.comando.manejador.empleado;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioEliminarEmpleado;

@Component
public class ManejadorEliminarEmpleado {
    private final ServicioEliminarEmpleado servicio;
    public ManejadorEliminarEmpleado(ServicioEliminarEmpleado servicio) {
        this.servicio = servicio;
    }
    public void eliminar(long id){
        this.servicio.eliminar(id);
    }

}
