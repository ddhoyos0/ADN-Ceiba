package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.adaptador;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;

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
	@Transactional
	@Sql(scripts = "/datos.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void crearEmpleado() {
		Empleado empleado = datos.buildEmpleado();
		adaptador.crear(empleado);
		assertTrue(adaptador.listar().size() > 0);

	}
	@Test
	public void listarEmpleado() {
		 List<Empleado> lista = adaptador.listar();
		 assertNotNull(lista);

	}	
	
	
	@Test
	public void eliminaarEmpleado() {
		adaptador.eliminar(1);
		assertTrue(adaptador.listar().size() == 0);
	}

}
