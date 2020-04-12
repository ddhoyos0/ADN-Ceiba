package com.djhoyos.citasweb.infraestructura.configuracion;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioEmpleado;
import com.djhoyos.citasweb.infraestructura.configuracion.EmpleadoBean;

class EmpleadoBeanTest {

	EmpleadoBean empleadoBean;
	RepositorioEmpleado repositorio;
	
	@BeforeEach
	public void inicio() {
		empleadoBean = new EmpleadoBean();
		repositorio = mock(RepositorioEmpleado.class);   
	}

	@Test
    void servicioCrearCitaBeanTest() {
        assertNotNull(empleadoBean.servicioCrearEmpleadoBean(repositorio));
    }
	
	@Test
    void ServicioListarCitaTest() {      
        assertNotNull(empleadoBean.servicioListarEmpleadoBean(repositorio));
    }
	
	@Test
    void ServicioEliminarCitaTest() {      
        assertNotNull(empleadoBean.servicioEliminarEmpleadoBean(repositorio));
    }
	
	@Test
    void servicioActualizarCitaBeanTest() {      
        assertNotNull(empleadoBean.servicioActualizarEmpleadoBean(repositorio));
    }
	

}
