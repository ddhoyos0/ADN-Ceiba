package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.dominio.modelo.Persona;

@Component
public final class FabricaPersona {

	private FabricaPersona() {
	}
	
	public static Persona modelo(ComandoPersona comando) {
		return new Persona(comando.getId(), FebricarIdentificacion.modelo(comando.getIdentificacion()) , comando.getDocumento(), comando.getNombre(),
				comando.getCelular(), comando.getDireccion(), comando.getEmail(), comando.isEstado());
	}

}
