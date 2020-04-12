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
import com.djhoyos.citasweb.dominio.modelo.Persona;

@DataJpaTest
@Import({ PersonaRepositorioAdaptador.class })
@EnableAutoConfiguration
@TestPropertySource(locations = "/test.properties")
class PersonaRepositorioAdaptadorTest {

	@Autowired
	private PersonaRepositorioAdaptador adaptador;
	public TestDataBuilder datos;
	public Persona persona;

	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		persona = new Persona();
	}

	@Test
	@Transactional
	@Sql(scripts = "/datos.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void crearPersona() {
		Persona persona = datos.buildPersona();
		adaptador.crear(persona);
		assertTrue(adaptador.listar().size() > 0);

	}

	@Test
	@Transactional
	@Sql(scripts = "/datos.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void actualizarPersona() {
		Persona persona = datos.buildPersona();
		adaptador.actualizar(persona);
		assertTrue(adaptador.listar().size() > 0);
	}

	@Test
	public void listarPersonas() {
		List<Persona> lista = adaptador.listar();
		assertNotNull(lista);

	}

	@Test
	public void eliminarPersona() {
		adaptador.eliminar(1);
		assertTrue(adaptador.listar().size() == 0);
	}

}
