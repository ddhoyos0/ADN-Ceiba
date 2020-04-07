package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.dominio.modelo.Servicio;
import org.springframework.stereotype.Component;
@Component
public final class FabricaServicio {

    public static Servicio modelo(ComandoServicio comando) {
        return new Servicio(
                comando.getId(),
                comando.getTipo(),
                comando.getPrecio(),
                comando.isEstado()
        );
    }   

}
