package com.djhoyos.citasweb.aplicacion.comando.manejador.persona;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.servicio.persona.ServicioActualizarPersona;

class ManejadorActualizarPersonaTest {

	TestDataBuilder datos;

	@Test
    void validarManejadorActualizarEmpleado() {
		datos = new TestDataBuilder();
        ComandoPersona comando = datos.buildComandoPersona();
        
        ServicioActualizarPersona service = mock(ServicioActualizarPersona.class);
        ManejadorActualizarPersona manejador = new ManejadorActualizarPersona(service);
        
        assertDoesNotThrow(() -> manejador.actualiza(comando));
    }


}
