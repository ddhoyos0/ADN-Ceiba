package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Persona;

public class FabricaPersonaTest {
    TestDataBuilder dataBuilder;
    ComandoPersona comando;
    Persona persona;

    @BeforeEach
    public void inicio() {
        persona = new Persona();
        comando = new ComandoPersona();
        dataBuilder = new TestDataBuilder();
    }

    @Test
    public void fabricarmodelo() {
        comando = new ComandoPersona(1,dataBuilder.buildDocumento(),"1566745754","Carlos ramos","3225467809","Calle 70 # 56-32","carlos@gmail.com");
        persona = FabricaPersona.modelo(comando);
        assertNotNull(persona);
    }

}