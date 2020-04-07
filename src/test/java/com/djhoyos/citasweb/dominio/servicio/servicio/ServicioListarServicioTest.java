package com.djhoyos.citasweb.dominio.servicio.servicio;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.djhoyos.citasweb.dominio.modelo.Servicio;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioServicio;

public class ServicioListarServicioTest {
    @Test
    void serviciolistarServicio() {
        RepositorioServicio repoMock = Mockito.mock(RepositorioServicio.class);
        List<Servicio> lista = new ArrayList<>();
        Mockito.when(repoMock.listar()).thenReturn(lista);
        ServicioListarServicio servicio = new ServicioListarServicio(repoMock);
        List<Servicio> resultado = servicio.listar();
        Assertions.assertEquals(lista.size(), resultado.size());
    }
}