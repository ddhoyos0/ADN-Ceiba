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
import com.djhoyos.citasweb.dominio.modelo.Cita;

@DataJpaTest
@Import({ CitaRepositorioAdaptador.class})
@EnableAutoConfiguration
@TestPropertySource(locations = "/test.properties")
class CitaRepositorioAdaptadorTest {
	
	@Autowired
	private CitaRepositorioAdaptador adaptador;
	
	public TestDataBuilder datos;
	public Cita cita;	
	
	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		cita = new Cita();
	}
	
	@Test
	@Transactional
	@Sql(scripts = "/datos.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void crearCita() {
		Cita cita = datos.buildCita();
		adaptador.crear(cita);
		assertTrue(adaptador.listar().size() > 0);

	}

	@Test
	public void listarCitas() {
		List<Cita> lista = adaptador.listar();
		assertNotNull(lista);

	}

	
	@Test
	public void consultarCitasPorEstado() {
		List<Cita> lista = adaptador.findByEstado(true);
		assertNotNull(lista);
	}
	
	@Test
	public void eliminaarCita() {
		adaptador.eliminar(1);
		assertTrue(adaptador.listar().size() == 0);
	}
	

}
