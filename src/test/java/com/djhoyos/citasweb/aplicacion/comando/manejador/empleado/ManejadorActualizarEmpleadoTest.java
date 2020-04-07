package com.djhoyos.citasweb.aplicacion.comando.manejador.empleado;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioActualizarEmpleado;

class ManejadorActualizarEmpleadoTest {


	TestDataBuilder datos;

	@Test
    void validarManejadorActulizarEmpleado() {
		datos = new TestDataBuilder();
        ComandoEmpleado comando = datos.buildComandoEmpleado();        
        ServicioActualizarEmpleado service = mock(ServicioActualizarEmpleado.class);
        ManejadorActualizarEmpleado manejador = new ManejadorActualizarEmpleado(service);

        assertDoesNotThrow(() -> manejador.actualiza(comando));
    }

}
