package com.djhoyos.citasweb.dominio.servicio.venta;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Venta;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioVenta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;

public class ServicioVentaTest {
    private TestDataBuilder datosBuilder = new TestDataBuilder();
    private ModelMapper modelMapper = new ModelMapper();
    @Test
    public void servicio_crear_cita(){
        Venta venta = modelMapper.map(datosBuilder.buildVenta(), Venta.class); ;
        RepositorioVenta repoMock = Mockito.mock(RepositorioVenta.class);
        Mockito.when(repoMock.crear(venta)).thenReturn(venta);
        ServicioCrearVenta servicio = new ServicioCrearVenta(repoMock);
        Venta resultado = servicio.crear(venta);
        Assertions.assertEquals(venta.getComision(), resultado.getComision());
    }
}
