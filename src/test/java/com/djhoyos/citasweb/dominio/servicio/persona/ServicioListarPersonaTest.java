package com.djhoyos.citasweb.dominio.servicio.persona;

import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioPersona;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ServicioListarPersonaTest {
    @Test
    void serviciolistarPersona() {
        RepositorioPersona repoMock = Mockito.mock(RepositorioPersona.class);
        List<Persona> lista = new ArrayList<>();
        Mockito.when(repoMock.listar()).thenReturn(lista);
        ServicioListarPersona servicio = new ServicioListarPersona(repoMock);
        List<Persona> resultado = servicio.ejecutar();
        Assertions.assertEquals(lista.size(), resultado.size());
    }

}