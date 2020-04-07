package com.djhoyos.citasweb.dominio.modelo;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.excepcion.ExcepcionesDominio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.Month;

public class CitaTest {

    @Autowired
    private TestDataBuilder dataBuilder;
    public Cita cita;


    @BeforeEach
    public void inicio(){
        cita = new Cita();
        dataBuilder = new TestDataBuilder();
    }

    @Test
    public void cita(){
        cita = dataBuilder.buildCita();
        Assertions.assertNotNull(cita);
    }

    @Test
    public void validarCampoFechaVacia(){
        Assertions.assertThrows(ExcepcionesDominio.class, () -> new Cita(
                1,
                null,
                dataBuilder.buildPersona(),
                dataBuilder.buildEmpleado(),
                dataBuilder.buildServicio(),
                true),  " La fecha no puede ser estar vacio"
        );
    }

    @Test
    public void validarFechaAnteriores (){
        Assertions.assertThrows(ExcepcionesDominio.class, () -> new Cita(
                1,
                LocalDateTime.of(2018, Month.APRIL, 29, 19, 30, 00),
                dataBuilder.buildPersona(),
                dataBuilder.buildEmpleado(),
                dataBuilder.buildServicio(),
                true),  "La fecha no puede ser menor a la actual"
        );
    }

    @Test
    public void validarCampoPersonaVacio (){
        Assertions.assertThrows(ExcepcionesDominio.class, () -> new Cita(
                1,
                LocalDateTime.of(2020, Month.APRIL, 29, 19, 30, 00),
               null,
                dataBuilder.buildEmpleado(),
                dataBuilder.buildServicio(),
                true),  "El campo persona no puede ser vacio"
        );
    }

    @Test
    public void validarCampoEmpleadoVacio (){
        Assertions.assertThrows(ExcepcionesDominio.class, () -> new Cita(
                1,
                LocalDateTime.of(2020, Month.APRIL, 29, 19, 30, 00),
                dataBuilder.buildPersona(),
                null,
                dataBuilder.buildServicio(),
                true),   "El campo empleado no puede ser vacio"
        );
    }

    @Test
    public void ValidarCampoServicioVacia (){
        Assertions.assertThrows(ExcepcionesDominio.class, () -> new Cita(
                1,
                LocalDateTime.of(2020, Month.APRIL, 29, 19, 30, 00),
                dataBuilder.buildPersona(),
                dataBuilder.buildEmpleado(),
                null,
                true),"El campo de servicio no puede ser vacio"
        );
    }
}