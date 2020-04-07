package com.djhoyos.citasweb.aplicacion.comando.manejador.venta;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.servicio.venta.ServicioEliminarVenta;

class ManejadorEliminarVentaTest {

	@Test
    void validarManejadorEliminarVenta() {		
        ServicioEliminarVenta service = mock(ServicioEliminarVenta.class);
        ManejadorEliminarVenta manejador = new ManejadorEliminarVenta(service);
        assertDoesNotThrow(() -> manejador.eliminar(1));
    }
}
