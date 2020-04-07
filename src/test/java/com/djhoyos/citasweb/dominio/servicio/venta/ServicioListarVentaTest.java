package com.djhoyos.citasweb.dominio.servicio.venta;

import com.djhoyos.citasweb.dominio.modelo.Venta;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioVenta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ServicioListarVentaTest {
    @Test
    void serviciolistarVenta() {
        RepositorioVenta repoMock = Mockito.mock(RepositorioVenta.class);
        List<Venta> lista = new ArrayList<>();
        Mockito.when(repoMock.listar()).thenReturn(lista);
        ServicioListarVenta servicio = new ServicioListarVenta(repoMock);
        List<Venta> resultado = servicio.listar();
        Assertions.assertEquals(lista.size(), resultado.size());
    }

}