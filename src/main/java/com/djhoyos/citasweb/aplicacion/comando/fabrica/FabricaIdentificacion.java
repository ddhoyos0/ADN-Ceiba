package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoIdentificacion;
import com.djhoyos.citasweb.dominio.modelo.Identificacion;

@Component
public final class FabricaIdentificacion {
	
	private FabricaIdentificacion() {
	}
	
	public static Identificacion modelo(ComandoIdentificacion comando) {
		return new Identificacion(comando.getId(), comando.getTipo());
	}
}
