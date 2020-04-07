package com.djhoyos.citasweb.aplicacion.comando.manejador.persona;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.servicio.persona.ServicioCrearPersona;

class ManejadorCrearPersonaTest {

	TestDataBuilder datos;

	@Test
    void validarManejadorCrearEmpleado() {
		datos = new TestDataBuilder();
        ComandoPersona comando = datos.buildComandoPersona();
        
        ServicioCrearPersona service = mock(ServicioCrearPersona.class);
        ManejadorCrearPersona manejador = new ManejadorCrearPersona(service);
        
        assertDoesNotThrow(() -> manejador.ejecutar(comando));
    }

}
