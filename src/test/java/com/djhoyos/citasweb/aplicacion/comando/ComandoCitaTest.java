package com.djhoyos.citasweb.aplicacion.comando;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.*;

public class ComandoCitaTest {

    ComandoCita comando;
    LocalDateTime fecha;
    TestDataBuilder dataBuilder;

    @BeforeEach
    public void inicio(){
        comando = new ComandoCita();
        fecha = LocalDateTime.of(2020, Month.OCTOBER,31,10,30,0);
        dataBuilder = new TestDataBuilder();
    }

    @Test
    void gettersCita() {
        assertNull(comando.getFecha());
        assertNull(comando.getPersona());
        assertNull(comando.getEmpleado());
        assertNull(comando.getServicio());
    }   

    @Test
    void comprobandoConstructores() {
         comando = dataBuilder.buildComandoCita();
        assertNotNull(comando);
    }
}