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
import com.djhoyos.citasweb.dominio.modelo.Servicio;

@DataJpaTest
@Import({ ServicioRepositorioAdaptador.class})
@EnableAutoConfiguration
@TestPropertySource(locations = "/test.properties")
class ServicioRepositorioAdaptadorTest {

	@Autowired
	private ServicioRepositorioAdaptador adaptador;
	public TestDataBuilder datos;
	public Servicio servicio;	
	
	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		servicio = new Servicio();
	}
	
	@Test
	public void listarServicio() {
		 List<Servicio> lista = adaptador.listar();
		 assertNotNull(lista);

	}
	
	@Test
	public void crearServicio() {
		servicio = datos.buildServicio();
		Servicio nueva = adaptador.crear(servicio);
		assertNotNull(nueva);

	}
}
