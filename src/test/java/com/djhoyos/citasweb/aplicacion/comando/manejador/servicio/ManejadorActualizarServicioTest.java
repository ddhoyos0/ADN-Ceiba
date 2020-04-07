package com.djhoyos.citasweb.aplicacion.comando.manejador.servicio;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioActualizarServicio;

class ManejadorActualizarServicioTest {
	TestDataBuilder datos;

	@Test
    void validarManejadorActualizarServicio() {
		datos = new TestDataBuilder();
        ComandoServicio comando = datos.buildComandoServicio();
        
        ServicioActualizarServicio service = mock(ServicioActualizarServicio.class);
        ManejadorActualizarServicio manejador = new ManejadorActualizarServicio(service);
        
        assertDoesNotThrow(() -> manejador.actualiza(comando));
    }

}
