package com.djhoyos.citasweb.aplicacion.comando.manejador.identificacion;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoIdentificacion;
import com.djhoyos.citasweb.aplicacion.comando.fabrica.FabricaIdentificacion;
import com.djhoyos.citasweb.dominio.servicio.identificacion.ServicioCrearIdentificacion;


@Component
public class ManejadorCrearIdentificacion {
	
	private final ServicioCrearIdentificacion servicio;
	
    public ManejadorCrearIdentificacion(ServicioCrearIdentificacion servicio) {
        this.servicio = servicio;
    }

    public void crear(ComandoIdentificacion comando) {  
        this.servicio.crear(FabricaIdentificacion.modelo(comando));
    }
}
