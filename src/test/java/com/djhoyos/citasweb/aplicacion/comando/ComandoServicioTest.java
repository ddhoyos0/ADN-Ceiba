package com.djhoyos.citasweb.aplicacion.comando;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ComandoServicioTest {

    ComandoServicio comando;
    TestDataBuilder dataBuilder;

    @BeforeEach
    public void inicio(){
        comando = new ComandoServicio();
        dataBuilder = new TestDataBuilder();
    }

    @Test
    void gettersServicio() {
        assertNull(comando.getTipo());
    }

    @Test
    void comprobandoConstructores() {
        comando = dataBuilder.buildComandoServicio();
        assertNotNull(comando);
    }
}