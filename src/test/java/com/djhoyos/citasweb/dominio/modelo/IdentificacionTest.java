package com.djhoyos.citasweb.dominio.modelo;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.excepcion.ExcepcionesDominio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class IdentificacionTest {

    @Autowired
    private TestDataBuilder dataBuilder;

    @BeforeEach
    public void before(){
        dataBuilder = new TestDataBuilder();
    }

    @Test
    public void tipo() {
        Assertions.assertEquals("Cedula de Ciudadanía", dataBuilder.buildDocumento().getTipo());
    }

    @Test
    public void validarCampoTipoNoVacio(){
        Assertions.assertThrows(ExcepcionesDominio.class, () -> new Identificacion(1,null), "El tipo de documento no puede ser vacio");
    }
}