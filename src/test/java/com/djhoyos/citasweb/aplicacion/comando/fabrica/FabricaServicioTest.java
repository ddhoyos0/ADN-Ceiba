package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Servicio;

public class FabricaServicioTest {
	TestDataBuilder dataBuilder;
    ComandoServicio comando;
    Servicio servicio;

    @BeforeEach
    public void inicio() {
        servicio = new Servicio();
        comando = new ComandoServicio();
        dataBuilder = new TestDataBuilder();
    }

    @Test
    void fabricarmodelo() {
        comando = new ComandoServicio(1,"Manicure",12000,false);
        servicio = FabricaServicio.modelo(comando);
        assertEquals(comando.getTipo(), servicio.getTipo());
        assertEquals(comando.getPrecio(), servicio.getPrecio());
    }

}