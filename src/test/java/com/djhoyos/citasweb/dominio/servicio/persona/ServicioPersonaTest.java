package com.djhoyos.citasweb.dominio.servicio.persona;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioPersona;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class ServicioPersonaTest {
    @Test
    public void servicio_crear_persona(){
        Persona persona = new TestDataBuilder().buildPersona();
        RepositorioPersona repoMock = Mockito.mock(RepositorioPersona.class);
        Mockito.when(repoMock.crear(persona)).thenReturn(persona);
        ServicioCrearPersona servicio = new ServicioCrearPersona(repoMock);
        Persona resultado = servicio.crear(persona);
        Assertions.assertEquals(persona.getNombre(), resultado.getNombre());
    }

}