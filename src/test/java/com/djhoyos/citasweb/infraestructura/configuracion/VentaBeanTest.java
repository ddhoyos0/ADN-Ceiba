package com.djhoyos.citasweb.infraestructura.configuracion;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioVenta;
import com.djhoyos.citasweb.infraestructura.configuracion.VentaBean;

class VentaBeanTest {

	VentaBean ventaBean;
	RepositorioVenta repositorio;
	
	@BeforeEach
	public void inicio() {
		ventaBean = new VentaBean();
		repositorio = mock(RepositorioVenta.class);   
	}

	@Test
    void servicioCrearCitaBeanTest() {
        assertNotNull(ventaBean.servicioCrearVentaBean(repositorio));
    }
	
	@Test
    void ServicioListarCitaTest() {      
        assertNotNull(ventaBean.servicioListarVentaBean(repositorio));
    }
	
	@Test
    void ServicioEliminarCitaTest() {      
        assertNotNull(ventaBean.servicioEliminarVentaBean(repositorio));
    }

}
