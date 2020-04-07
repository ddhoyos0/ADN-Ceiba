package com.djhoyos.citasweb.aplicacion.comando.manejador.servicio;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioCrearServicio;

class ManejadorCrearServicioTest {

	TestDataBuilder datos;

	@Test
    void validarManejadorCrearServicio() {
		datos = new TestDataBuilder();
        ComandoServicio comando = datos.buildComandoServicio();
        
        ServicioCrearServicio service = mock(ServicioCrearServicio.class);
        ManejadorCrearServicio manejador = new ManejadorCrearServicio(service);
        
        assertDoesNotThrow(() -> manejador.crear(comando));
    }

}
