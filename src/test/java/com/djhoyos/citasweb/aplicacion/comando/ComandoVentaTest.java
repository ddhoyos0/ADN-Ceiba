package com.djhoyos.citasweb.aplicacion.comando;


import com.djhoyos.citasweb.databuider.TestDataBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ComandoVentaTest {

    ComandoVenta comando;
    TestDataBuilder dataBuilder;

    @BeforeEach
    public void inicio(){
        comando = new ComandoVenta();
        dataBuilder = new TestDataBuilder();
    }

    @Test
    void gettersVenta() {
        assertNull(comando.getCita());
        assertNull(comando.getFecha());
    }

    @Test
    void comprobandoConstructores() {
        comando = dataBuilder.buildComandoVenta();
        assertNotNull(comando);
    }
}