package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import com.djhoyos.citasweb.aplicacion.comando.ComandoIdentificacion;
import com.djhoyos.citasweb.dominio.modelo.Identificacion;

public class FebricarIdentificacion {
	
	private FebricarIdentificacion() {
	}
	public static Identificacion modelo(ComandoIdentificacion comando) {
		return new Identificacion(comando.getId(), comando.getTipo());
	}
}
