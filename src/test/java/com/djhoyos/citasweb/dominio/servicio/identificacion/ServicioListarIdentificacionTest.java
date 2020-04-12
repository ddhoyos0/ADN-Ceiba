package com.djhoyos.citasweb.dominio.servicio.identificacion;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.djhoyos.citasweb.dominio.modelo.Identificacion;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioIdentificacion;

class ServicioListarIdentificacionTest {

    @Test
    void listarIDentificacion() {
        RepositorioIdentificacion repoMock = Mockito.mock(RepositorioIdentificacion.class);
        List<Identificacion> lista = new ArrayList<>();
        Mockito.when(repoMock.listar()).thenReturn(lista);
        ServicioListarIdentificacion servicio = new ServicioListarIdentificacion(repoMock);
        List<Identificacion> resultado = servicio.listar();
        Assertions.assertEquals(lista.size(), resultado.size());
    }
    

}
