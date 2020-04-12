package com.djhoyos.citasweb.dominio.modelo;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class VentaTest {

    private TestDataBuilder dataBuilder;
    @BeforeEach
    public void before(){
        dataBuilder = new TestDataBuilder();
    }

    @Test
    public void crearObjetoVenta(){
        Venta venta = new Venta();
        venta.setId(1);
        venta.setFecha(LocalDate.now());
        venta.setCita(dataBuilder.buildCita());
        venta.setComision(10000);
        venta.setUtilidad(10000);
        venta.setTotal(20000);
        venta.setEstado(false);
        Assertions.assertEquals(10000, venta.getComision());
    }
}
