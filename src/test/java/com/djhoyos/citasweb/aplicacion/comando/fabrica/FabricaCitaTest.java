package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDateTime;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoCita;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Cita;

public class FabricaCitaTest {
	
	TestDataBuilder dataBuilder;
    ComandoCita comando;
    Cita cita;
    LocalDateTime fecha;

    @BeforeEach
    public void inicio() {
        comando = new ComandoCita();
        cita = new Cita();
        dataBuilder = new TestDataBuilder();
        fecha = LocalDateTime.of(2020, Month.OCTOBER,30,10,30,0);
    }
    
    @Test
   public void validandoFabrica() {
        ComandoCita comando = new ComandoCita(1, fecha,dataBuilder.buildPersona(),dataBuilder.buildEmpleado(),dataBuilder.buildServicio(),false);
        cita = FabricaCita.modelo(comando);       
        assertNotNull(cita);
    }

}