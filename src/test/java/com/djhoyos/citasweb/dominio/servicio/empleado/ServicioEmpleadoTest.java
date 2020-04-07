package com.djhoyos.citasweb.dominio.servicio.empleado;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioEmpleado;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

public class ServicioEmpleadoTest {
    @Autowired
    private TestDataBuilder dataBuilder;

    @BeforeEach
    public void inicio(){
        dataBuilder = new TestDataBuilder();
    }

    @Test
    public void servicio_crear_empleado(){
        Empleado empleado = dataBuilder.buildEmpleado();
        RepositorioEmpleado repoMock = Mockito.mock(RepositorioEmpleado.class);
        Mockito.when(repoMock.crear(empleado)).thenReturn(empleado);
        ServicioCrearEmpleado servicio = new ServicioCrearEmpleado(repoMock);
        Empleado resultado = servicio.crear(empleado);
        Assertions.assertEquals(empleado.getPorcentaje(), resultado.getPorcentaje());

    }

}
