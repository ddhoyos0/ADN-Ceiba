package com.djhoyos.citasweb.dominio.servicio.empleado;

import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioEmpleado;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ServicioListarEmpleadoTest {
    @Test
    void serviciolistarEmpleado() {
        RepositorioEmpleado repoMock = Mockito.mock(RepositorioEmpleado.class);
        List<Empleado> lista = new ArrayList<>();
        Mockito.when(repoMock.listar()).thenReturn(lista);
        ServicioListarEmpleado servicio = new ServicioListarEmpleado(repoMock);
        List<Empleado> resultado = servicio.listar();
        Assertions.assertEquals(lista.size(), resultado.size());
    }

}