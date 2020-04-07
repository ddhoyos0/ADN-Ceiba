package com.djhoyos.citasweb.aplicacion.comando.manejador.persona;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.servicio.persona.ServicioListarPersona;

class ManejadorListarPersonaTest {

	@Test
    void validarManejadorListarPersona() {		       
        ServicioListarPersona servicio = mock(ServicioListarPersona.class);         
        ManejadorListarPersona manejador = new ManejadorListarPersona(servicio);
        assertDoesNotThrow(manejador::ejecutar);
    }

}
