package com.djhoyos.citasweb.aplicacion.comando.manejador.empleado;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioCrearEmpleado;

class ManejadorCrearEmpleadoTest {
	TestDataBuilder datos;

	@Test
    void validarManejadorCrearEmpleado() {
		datos = new TestDataBuilder();
        ComandoEmpleado comando = datos.buildComandoEmpleado();
        
        ServicioCrearEmpleado service = mock(ServicioCrearEmpleado.class);
        ManejadorCrearEmpleado manejador = new ManejadorCrearEmpleado(service);

        assertDoesNotThrow(() -> manejador.crear(comando));
    }

}
