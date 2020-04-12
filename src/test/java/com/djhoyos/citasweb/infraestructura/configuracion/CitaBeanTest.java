package com.djhoyos.citasweb.infraestructura.configuracion;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioCita;
import com.djhoyos.citasweb.infraestructura.configuracion.CitaBean;

class CitaBeanTest {
	
	CitaBean citaBean;
	RepositorioCita repositorio;
	
	@BeforeEach
	public void inicio() {
		citaBean = new CitaBean();
		repositorio = mock(RepositorioCita.class);   
	}

	@Test
    void ServicioListarCitaTest() {      
        assertNotNull(citaBean.servicioListarCitaBean(repositorio));
    }
	
	@Test
    void ServicioEliminarCitaTest() {      
        assertNotNull(citaBean.servicioEliminaCitaBean(repositorio));
    }
	
	@Test
    void servicioActualizarCitaBeanTest() {      
        assertNotNull(citaBean.servicioActualizarCitaBean(repositorio));
    }
	
}
