package com.djhoyos.citasweb.aplicacion.comando;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.databuider.TestDataBuilder;

class ComandoIdentificacionTest {
	
	ComandoIdentificacion comando;
	TestDataBuilder dataBuilder;

	@BeforeEach
	public void inicio() {
		comando = new ComandoIdentificacion();
		dataBuilder = new TestDataBuilder();
	}


	@Test
	void comprobandoConstructores() {
		comando = dataBuilder.buildComandoDocumento();
		assertNotNull(comando);
	}
}
