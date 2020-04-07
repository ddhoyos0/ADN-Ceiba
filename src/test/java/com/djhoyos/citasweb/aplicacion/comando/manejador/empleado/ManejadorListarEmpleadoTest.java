package com.djhoyos.citasweb.aplicacion.comando.manejador.empleado;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioListarEmpleado;

class ManejadorListarEmpleadoTest {

	@Test
    void validarManejadorListarEmpleado() {		       
        ServicioListarEmpleado servicio = mock(ServicioListarEmpleado.class);         
        ManejadorListarEmpleado manejador = new ManejadorListarEmpleado(servicio);
        assertDoesNotThrow(manejador::ejecutar);
    }
}
