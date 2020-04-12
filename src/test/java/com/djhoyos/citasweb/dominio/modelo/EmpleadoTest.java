package com.djhoyos.citasweb.dominio.modelo;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.excepcion.ExcepcionesDominio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpleadoTest {
    @Autowired
    private TestDataBuilder dataBuilder;
    Empleado empleado;
    Identificacion documento;
    @BeforeEach
    public void before(){
        dataBuilder = new TestDataBuilder();
        documento = new Identificacion();
        documento.setId(1);
        documento.setTipo("Nit");
    }

    @Test
    public void empleado() {
        empleado = new Empleado();
        empleado.setPersona(dataBuilder.buildPersona());
        empleado.setPorcentaje(50);
        Assertions.assertEquals(50, empleado.getPorcentaje());
    }

    @Test
    public void validar_porcentaje(){
        Assertions.assertThrows(
                ExcepcionesDominio.class, () -> new Empleado(
                1,
                0,
                dataBuilder.buildPersona(),
                false), "El porcentaje no puede ser cero o negativo"
                
        );
    }

}