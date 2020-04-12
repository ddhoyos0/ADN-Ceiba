package com.djhoyos.citasweb.infraestructura.configuracion;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioServicio;
import com.djhoyos.citasweb.infraestructura.configuracion.ServicioBean;

class ServicioBeanTest {

	ServicioBean servicioBean;
	RepositorioServicio repositorio;
	
	@BeforeEach
	public void inicio() {
		servicioBean = new ServicioBean();
		repositorio = mock(RepositorioServicio.class);   
	}

	@Test
    void servicioCrearCitaBeanTest() {
        assertNotNull(servicioBean.servicioCrearServicioBean(repositorio));
    }
	
	@Test
    void ServicioListarCitaTest() {      
        assertNotNull(servicioBean.servicioListarServicioBean(repositorio));
    }
	
	@Test
    void ServicioEliminarCitaTest() {      
        assertNotNull(servicioBean.servicioEliminarServicioBean(repositorio));
    }
	
	@Test
    void servicioActualizarCitaBeanTest() {      
        assertNotNull(servicioBean.servicioActualizarServicioBean(repositorio));
    }

}
