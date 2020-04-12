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
import com.djhoyos.citasweb.dominio.modelo.Identificacion;

@DataJpaTest
@Import({ IdentificacionRepositorioAdaptador.class})
@EnableAutoConfiguration
@TestPropertySource(locations = "/test.properties")
class IdentificacionRepositorioAdaptadorTest {

	@Autowired
	private IdentificacionRepositorioAdaptador adaptador;
	
	public TestDataBuilder datos;
	public Identificacion identificacion;	
	
	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		identificacion = new Identificacion();
	}
	
	@Test
	public void listarIdentificacion() {
		List<Identificacion> lista = adaptador.listar();
		assertNotNull(lista);

	}	
	

}
