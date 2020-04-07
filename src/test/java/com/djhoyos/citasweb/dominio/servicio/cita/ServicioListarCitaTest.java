package com.djhoyos.citasweb.dominio.servicio.cita;

import com.djhoyos.citasweb.dominio.modelo.Cita;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioCita;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;


public class ServicioListarCitaTest {

    @Test
    void listarCitas() {
        RepositorioCita repoMock = Mockito.mock(RepositorioCita.class);
        List<Cita> lista = new ArrayList<>();
        Mockito.when(repoMock.listar()).thenReturn(lista);
        ServicioListarCita servicio = new ServicioListarCita(repoMock);
        List<Cita> resultado = servicio.listar();
        Assertions.assertEquals(lista.size(), resultado.size());
    }
    
    @Test
    void listarCitasEstado() {
        RepositorioCita repoMock = Mockito.mock(RepositorioCita.class);
        List<Cita> lista = new ArrayList<>();
        Mockito.when(repoMock.listar()).thenReturn(lista);
        ServicioListarCita servicio = new ServicioListarCita(repoMock);        
        List<Cita> r = servicio.listEstado(false);
        Assertions.assertEquals(lista.size(), r.size());
    }
}