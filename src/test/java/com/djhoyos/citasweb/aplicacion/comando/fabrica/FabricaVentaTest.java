package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoVenta;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Venta;

public class FabricaVentaTest {
	TestDataBuilder dataBuilder;
    ComandoVenta comando;
    Venta venta;


    @BeforeEach
    public void inicio() {
        venta = new Venta();        
        comando = new ComandoVenta();
        dataBuilder = new TestDataBuilder();
    }

    @Test
    public void fabricarmodelo() {
        comando = new ComandoVenta(1, LocalDate.now(),dataBuilder.buildComandoCita(),10000,10000,20000,false);
        venta = FabricaVenta.modelo(comando);
        assertNotNull(venta);
    }

}