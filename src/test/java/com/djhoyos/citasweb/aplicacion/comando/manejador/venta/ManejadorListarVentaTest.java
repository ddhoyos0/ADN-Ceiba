package com.djhoyos.citasweb.aplicacion.comando.manejador.venta;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.servicio.venta.ServicioListarVenta;

class ManejadorListarVentaTest {
	@Test
    void validarManejadorListarVenta() {		       
        ServicioListarVenta servicio = mock(ServicioListarVenta.class);         
        ManejadorListarVenta manejador = new ManejadorListarVenta(servicio);
        assertDoesNotThrow(manejador::listar);
    }


}
