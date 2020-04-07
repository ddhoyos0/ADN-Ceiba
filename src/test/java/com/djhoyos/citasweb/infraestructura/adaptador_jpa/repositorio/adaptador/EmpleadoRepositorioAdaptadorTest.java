package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.adaptador;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Empleado;

@DataJpaTest
@Import({ EmpleadoRepositorioAdaptador.class})
@EnableAutoConfiguration
@TestPropertySource(locations = "/test.properties")
class EmpleadoRepositorioAdaptadorTest {
	
	@Autowired
	private EmpleadoRepositorioAdaptador adaptador;
	
	public TestDataBuilder datos;
	public Empleado empleado;	
	
	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		empleado = new Empleado();
	}

	
	@Test
	public void listarEmpleado() {
		 List<Empleado> lista = adaptador.listar();
		 assertNotNull(lista);

	}
	
	@Test
	public void crearEmpleado() {
		empleado = datos.buildEmpleado();
		Empleado nueva = adaptador.crear(empleado);
		assertNotNull(nueva);

	}
		

}
