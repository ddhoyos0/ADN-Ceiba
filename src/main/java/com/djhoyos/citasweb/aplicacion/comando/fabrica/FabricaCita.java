package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.djhoyos.citasweb.aplicacion.comando.ComandoCita;
import com.djhoyos.citasweb.dominio.modelo.Cita;

@Component
public final class FabricaCita {

	private FabricaCita() {
	}

	public static Cita modelo(ComandoCita comando) {
		return new Cita(
				comando.getId(),
				comando.getFecha(),
				FabricaPersona.modelo(comando.getPersona()),
				FabricaEmpleado.modelo(comando.getEmpleado()),
				FabricaServicio.modelo(comando.getServicio()),
				comando.isEstado());
	}

}
