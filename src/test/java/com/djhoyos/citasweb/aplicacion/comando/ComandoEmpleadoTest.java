package com.djhoyos.citasweb.aplicacion.comando;


import com.djhoyos.citasweb.databuider.TestDataBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ComandoEmpleadoTest {

    ComandoEmpleado comando;
    TestDataBuilder dataBuilder;

    @BeforeEach
    public void inicio(){
        comando = new ComandoEmpleado();
        dataBuilder = new TestDataBuilder();
    }

    @Test
    void gettersEmpleado() {
        assertNull(comando.getPersona());
    }

    @Test
    void comprobandoConstructores() {
        comando = dataBuilder.buildComandoEmpleado();
        assertNotNull(comando);
    }

}