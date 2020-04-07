package com.djhoyos.citasweb.aplicacion.comando.configuracion;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioPersona;
import com.djhoyos.citasweb.infraestructura.configuracion.PersonaBean;

class PersonaBeanTest {

	PersonaBean personaBean;
	RepositorioPersona repositorio;
	
	@BeforeEach
	public void inicio() {
		personaBean = new PersonaBean();
		repositorio = mock(RepositorioPersona.class);   
	}

	@Test
    void servicioCrearCitaBeanTest() {
        assertNotNull(personaBean.servicioCrearPersonaBean(repositorio));
    }
	
	@Test
    void ServicioListarCitaTest() {      
        assertNotNull(personaBean.servicioListarPersonaBean(repositorio));
    }
	
	@Test
    void ServicioEliminarCitaTest() {      
        assertNotNull(personaBean.servicioEliminaPersonaBean(repositorio));
    }
	
	@Test
    void servicioActualizarCitaBeanTest() {      
        assertNotNull(personaBean.servicioActualizarPersonaBean(repositorio));
    }
	
}
