package com.djhoyos.citasweb.dominio.servicio.cita;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioCita;


public class ServicioEliminarCitaTest {

    @Test
    void servicioEliminarCita() {
        // arrange
        RepositorioCita repoMock = Mockito.mock(RepositorioCita.class);
        ServicioEliminarCita service = new ServicioEliminarCita(repoMock);
        // act - assert
        Assertions.assertDoesNotThrow(() -> service.eliminar(1));
    }


}