package com.djhoyos.citasweb.aplicacion.comando.manejador.cita;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoCita;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.servicio.cita.ServicioCrearCita;

class ManejadorCrearCitaTest {
	
	TestDataBuilder datos;

	@Test
    void validarManejadorCrearCita() {
		datos = new TestDataBuilder();
        ComandoCita comando = datos.buildComandoCita();
        
        ServicioCrearCita service = mock(ServicioCrearCita.class);
        ManejadorCrearCita manejador = new ManejadorCrearCita(service);

        assertDoesNotThrow(() -> manejador.crear(comando));
    }
}
