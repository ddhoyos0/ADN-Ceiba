package com.djhoyos.citasweb.aplicacion.comando.manejador.empleado;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioEliminarEmpleado;

class ManejadorEliminarEmpleadoTest {

	@Test
    void validarManejadorEliminarEmpleado() {		
        ServicioEliminarEmpleado service = mock(ServicioEliminarEmpleado.class);
        ManejadorEliminarEmpleado manejador = new ManejadorEliminarEmpleado(service);
        assertDoesNotThrow(() -> manejador.eliminar(1));
    }

}
