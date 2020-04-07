package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Empleado;

public class FabricaEmpleadoTest {
	TestDataBuilder dataBuilder;
    ComandoEmpleado comando;
    Empleado empleado;

    @BeforeEach
    public void inicio() {
        comando = new ComandoEmpleado();
        dataBuilder = new TestDataBuilder();
    }

    @Test
    public void fabricarmodelo() {
        comando = new ComandoEmpleado(1,50,dataBuilder.buildComandoPersona(),false);
        empleado = FabricaEmpleado.modelo(comando);
        assertNotNull(empleado);
    }

}