package com.djhoyos.citasweb.infraestructura.configuracion;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioIdentificacion;

class IdentificacionBeanTest {

	IdentificacionBean bean;
	RepositorioIdentificacion repositorio;
	
	@BeforeEach
	public void inicio() {
		bean = new IdentificacionBean();
		repositorio = mock(RepositorioIdentificacion.class);   
	}

	@Test
    void ServicioListarCitaTest() {      
        assertNotNull(bean.servicioListarIdentificacionBean(repositorio));
    }

}
