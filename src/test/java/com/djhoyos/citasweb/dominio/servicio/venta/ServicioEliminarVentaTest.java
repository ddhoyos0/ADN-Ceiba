package com.djhoyos.citasweb.dominio.servicio.venta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioVenta;

public class ServicioEliminarVentaTest {

    @Test
    void servicioEliminarVenta() {
        // arrange
        RepositorioVenta repoMock = Mockito.mock(RepositorioVenta.class);
        ServicioEliminarVenta service = new ServicioEliminarVenta(repoMock);
        // act - assert
        Assertions.assertDoesNotThrow(() -> service.eliminar(1));
    }

}