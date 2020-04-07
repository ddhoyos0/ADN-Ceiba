package com.djhoyos.citasweb.dominio.servicio.empleado;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioEmpleado;

public class ServicioEliminarEmpleadoTest {

    @Test
    void servicioEliminarEmpleado() {
        // arrange
        RepositorioEmpleado repoMock = Mockito.mock(RepositorioEmpleado.class);
        ServicioEliminarEmpleado service = new ServicioEliminarEmpleado(repoMock);
        // act - assert
        Assertions.assertDoesNotThrow(() -> service.eliminar(1));
    }

}