package com.djhoyos.citasweb.aplicacion.comando.manejador.servicio;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioListarServicio;

class ManejadorListarServicioTest {
	@Test
    void validarManejadorListarServicio() {		       
        ServicioListarServicio servicio = mock(ServicioListarServicio.class);         
        ManejadorListarServicio manejador = new ManejadorListarServicio(servicio);
        assertDoesNotThrow(manejador::ejecutar);
    }

}
