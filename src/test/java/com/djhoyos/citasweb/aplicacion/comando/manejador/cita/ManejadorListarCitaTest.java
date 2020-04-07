package com.djhoyos.citasweb.aplicacion.comando.manejador.cita;

import com.djhoyos.citasweb.dominio.servicio.cita.ServicioListarCita;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

public class ManejadorListarCitaTest {
    @Test
    void validarManejadorListarCita() {
        ServicioListarCita servicio = mock(ServicioListarCita.class);
        ManejadorListarCita manejador = new ManejadorListarCita(servicio);
        assertDoesNotThrow(manejador::ejecutar);
    }

}