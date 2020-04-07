package com.djhoyos.citasweb.aplicacion.comando.manejador.cita;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoCita;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.servicio.cita.ServicioActualizarCita;

class ManejadorActualizarCitaTest {

	TestDataBuilder datos;

	@Test
    void validarManejadorActulizarCita() {
		datos = new TestDataBuilder();
        ComandoCita comando = datos.buildComandoCita();        
        ServicioActualizarCita service = mock(ServicioActualizarCita.class);
        ManejadorActualizarCita manejador = new ManejadorActualizarCita(service);

        assertDoesNotThrow(() -> manejador.actualiza(comando));
    }

}
