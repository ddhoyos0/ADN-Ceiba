package com.djhoyos.citasweb.aplicacion.comando.manejador.cita;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.servicio.cita.ServicioEliminarCita;

class ManejadorEliminarCitaTest {

	@Test
    void validarManejadorEliminarCita() {		
        ServicioEliminarCita service = mock(ServicioEliminarCita.class);
        ManejadorEliminarCita manejador = new ManejadorEliminarCita(service);
        assertDoesNotThrow(() -> manejador.eliminar(1));
    }

}
