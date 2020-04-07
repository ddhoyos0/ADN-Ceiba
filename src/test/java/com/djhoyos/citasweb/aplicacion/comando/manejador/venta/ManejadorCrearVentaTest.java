package com.djhoyos.citasweb.aplicacion.comando.manejador.venta;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoVenta;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.servicio.venta.ServicioCrearVenta;

class ManejadorCrearVentaTest {

	TestDataBuilder datos;

	@Test
    void validarManejadorCrearVenta() {
		datos = new TestDataBuilder();
        ComandoVenta comando = datos.buildComandoVenta();
        
        ServicioCrearVenta service = mock(ServicioCrearVenta.class);
        ManejadorCrearVenta manejador = new ManejadorCrearVenta(service);
        
        assertDoesNotThrow(() -> manejador.crear(comando));
    }
}
