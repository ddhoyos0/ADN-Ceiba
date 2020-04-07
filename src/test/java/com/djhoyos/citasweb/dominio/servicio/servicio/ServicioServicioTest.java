package com.djhoyos.citasweb.dominio.servicio.servicio;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Servicio;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioServicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServicioServicioTest {
    @Test
    public void servicio_crear_test(){
        Servicio servicio = new TestDataBuilder().buildServicio();
        RepositorioServicio repoMock = Mockito.mock(RepositorioServicio.class);
        Mockito.when(repoMock.crear(servicio)).thenReturn(servicio);
        ServicioCrearServicio servi = new ServicioCrearServicio(repoMock);
        Servicio resultado = servi.crear(servicio);
        Assertions.assertEquals(servicio.getPrecio(), resultado.getPrecio());
    }

}
