package com.djhoyos.citasweb.dominio.servicio.servicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioServicio;


public class ServicioEliminarServicioTest {
    
    @Test
    void servicioEliminarServicio() {
        // arrange
        RepositorioServicio repoMock = Mockito.mock(RepositorioServicio.class);
        ServicioEliminarServicio service = new ServicioEliminarServicio(repoMock);
        // act - assert
        Assertions.assertDoesNotThrow(() -> service.eliminar(1));
    }

}