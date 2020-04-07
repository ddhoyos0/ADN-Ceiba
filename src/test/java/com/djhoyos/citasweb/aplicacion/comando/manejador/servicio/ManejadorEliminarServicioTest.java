package com.djhoyos.citasweb.aplicacion.comando.manejador.servicio;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioEliminarServicio;

class ManejadorEliminarServicioTest {

	@Test
    void validarManejadorEliminarServicio() {		
        ServicioEliminarServicio service = mock(ServicioEliminarServicio.class);
        ManejadorEliminarServicio manejador = new ManejadorEliminarServicio(service);
        assertDoesNotThrow(() -> manejador.eliminar(1));
    }

}
