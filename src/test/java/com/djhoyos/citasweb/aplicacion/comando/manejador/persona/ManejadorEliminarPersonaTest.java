package com.djhoyos.citasweb.aplicacion.comando.manejador.persona;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.servicio.persona.ServicioEliminaPersona;

class ManejadorEliminarPersonaTest {

	@Test
    void validarManejadorEliminarPersona() {		
        ServicioEliminaPersona service = mock(ServicioEliminaPersona.class);
        ManejadorEliminarPersona manejador = new ManejadorEliminarPersona(service);
        assertDoesNotThrow(() -> manejador.eliminar(1));
    }

}
