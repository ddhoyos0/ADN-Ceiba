package com.djhoyos.citasweb.aplicacion.comando.manejador.identificacion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoIdentificacion;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.servicio.identificacion.ServicioCrearIdentificacion;

class ManejadorCrearIdentificacionTest {

	
	TestDataBuilder datos;

	@Test
    void validarManejadorCrearCita() {
		datos = new TestDataBuilder();
        ComandoIdentificacion comando = datos.buildComandoDocumento();
        
        ServicioCrearIdentificacion service = mock(ServicioCrearIdentificacion.class);
        ManejadorCrearIdentificacion manejador = new ManejadorCrearIdentificacion(service);

        assertDoesNotThrow(() -> manejador.crear(comando));
    }
}
