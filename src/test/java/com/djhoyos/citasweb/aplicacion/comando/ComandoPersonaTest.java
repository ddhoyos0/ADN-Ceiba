package com.djhoyos.citasweb.aplicacion.comando;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ComandoPersonaTest {

    ComandoPersona comando;
    TestDataBuilder dataBuilder;

    @BeforeEach
    public void inicio(){
        comando = new ComandoPersona();
        dataBuilder = new TestDataBuilder();
    }

    @Test
    void gettersPersona() {
        assertNull(comando.getIdentificacion());
        assertNull(comando.getDocumento());
        assertNull(comando.getNombre());
        assertNull(comando.getCelular());
        assertNull(comando.getDireccion());
        assertNull(comando.getEmail());
    }

    @Test
    void comprobandoConstructores() {
        comando = dataBuilder.buildComandoPersona();
        assertNotNull(comando);
    }
}