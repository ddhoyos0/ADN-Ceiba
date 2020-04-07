package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.dominio.modelo.Persona;
import org.springframework.stereotype.Component;
@Component
public final class FabricaPersona {
    public static Persona modelo(ComandoPersona comando) {
        return new Persona(
                comando.getId(),
                comando.getTipo_documento(),
                comando.getDocumento(),
                comando.getNombre(),
                comando.getCelular(),
                comando.getDireccion(),
                comando.getEmail(),
                comando.isEstado()
        );
    }

}
