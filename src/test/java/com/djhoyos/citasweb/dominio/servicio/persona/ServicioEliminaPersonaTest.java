package com.djhoyos.citasweb.dominio.servicio.persona;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioPersona;

public class ServicioEliminaPersonaTest {

    @Test
    void servicioEliminarEmpleado() {
        // arrange
        RepositorioPersona repoMock = Mockito.mock(RepositorioPersona.class);
        ServicioEliminaPersona service = new ServicioEliminaPersona(repoMock);
        // act - assert
        Assertions.assertDoesNotThrow(() -> service.eliminar(1));
    }
}