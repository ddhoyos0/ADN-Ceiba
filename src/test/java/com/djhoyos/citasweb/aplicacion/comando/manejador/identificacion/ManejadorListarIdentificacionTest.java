package com.djhoyos.citasweb.aplicacion.comando.manejador.identificacion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.servicio.identificacion.ServicioListarIdentificacion;

class ManejadorListarIdentificacionTest {

	@Test
	void validarManejadorListarIdentificacion() {
		ServicioListarIdentificacion servicio = mock(ServicioListarIdentificacion.class);
		ManejadorListarIdentificacion manejador = new ManejadorListarIdentificacion(servicio);
		assertDoesNotThrow(manejador::ejecutar);
	}

}
