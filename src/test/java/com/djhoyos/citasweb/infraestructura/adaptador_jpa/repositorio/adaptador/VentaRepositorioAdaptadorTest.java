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
import com.djhoyos.citasweb.dominio.modelo.Venta;

@DataJpaTest
@Import({ VentaRepositorioAdaptador.class})
@EnableAutoConfiguration
@TestPropertySource(locations = "/test.properties")
class VentaRepositorioAdaptadorTest {

	@Autowired
	private VentaRepositorioAdaptador adaptador;
	public TestDataBuilder datos;
	public Venta venta;	
	
	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		venta = new Venta();
	}
	

	@Test
	@Transactional
	@Sql(scripts = "/datos.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void crearVenta() {
		Venta venta = datos.buildVenta();
		adaptador.crear(venta);
		assertTrue(adaptador.listar().size() > 0);

	}

	@Test
	public void listarVenta() {
		 List<Venta> lista = adaptador.listar();
		 assertNotNull(lista);

	}

	@Test
	public void listarCitasPorEstado() {
		List<Venta> lista = adaptador.findByEstado(true);
		assertNotNull(lista);

	}	
	
	@Test
	public void eliminarVenta() {
		adaptador.eliminar(1);
		assertTrue(adaptador.listar().size() == 0);
	}


}
