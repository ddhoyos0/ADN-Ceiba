package com.djhoyos.citasweb.databuider;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import com.djhoyos.citasweb.aplicacion.comando.ComandoCita;
import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.aplicacion.comando.ComandoIdentificacion;
import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.aplicacion.comando.ComandoVenta;
import com.djhoyos.citasweb.dominio.modelo.Cita;
import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.modelo.Identificacion;
import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.modelo.Servicio;
import com.djhoyos.citasweb.dominio.modelo.Venta;

public class TestDataBuilder {

	
	/**
	 * Objeto Documento
	 */
	private static final String TIPO = "Cedula de Ciudadanía";

	/**
	 * objeto ComandoDocumento
	 */
	public ComandoIdentificacion buildComandoDocumento() {
		return new ComandoIdentificacion(1, TIPO);
	}
	/**
	 * objeto Documento
	 */
	public Identificacion buildDocumento() {
		return new Identificacion(1, TIPO);
	}
	/**
	 * Objeto ComandoPersona
	 */
	private static final int PORCENTAJE = 50;
	private static final String NUMERO = "1066732570";
	private static final String NOMBRE = "Jose carlos petro";
	private static final String CELULAR = "3006552632";
	private static final String EMAIL = "admin@gmail.com";
	private static final String DIRECCION = "Calle 25 #32-54";

	public ComandoPersona buildComandoPersona() {
		return new ComandoPersona(1,buildDocumento(), NUMERO, NOMBRE, CELULAR, DIRECCION, EMAIL);
	}

	/**
	 * objeto Persona
	 */
	public Persona buildPersona() {
		return new Persona(3, buildDocumento(), "10778324", "carlos ramos", "3225467890", "calle 34 # 43-34",
				"carlos@gmail.com");
	}


	/**
	 * Objeto ComandoEmpleado
	 * 
	 * @return
	 */
	public ComandoEmpleado buildComandoEmpleado() {
		return new ComandoEmpleado(1, PORCENTAJE, buildPersona(), false);
	}

	/**
	 * objeto Empleado
	 */
	public Empleado buildEmpleado() {
		return new Empleado(1, PORCENTAJE, buildPersona(), false);
	}

	/**
	 * Objeto ComandoServicio
	 */
	private static final String TIPOSERVICIO = "Pedicure";
	private static final int PRECIO = 25000;

	public ComandoServicio buildComandoServicio() {
		return new ComandoServicio(1, TIPOSERVICIO, PRECIO, false);
	}

	/**
	 * objecto Servicio
	 * @return
	 */

	public Servicio buildServicio() {
		return new Servicio(2, "Pedicure", 15000, false);
	}
	

	/**
	 * Objeto ComandoCita
	 */
	private static final LocalDateTime FECHA = LocalDateTime.of(2020, Month.DECEMBER, 30, 15, 30, 00);

	public ComandoCita buildComandoCita() {
		return new ComandoCita(1, FECHA, buildPersona(), buildEmpleado(), buildServicio(), false);
	}

	/**
	 * objeto Cita
	 */
	public Cita buildCita() {
		return new Cita(1, LocalDateTime.of(2020, Month.DECEMBER, 30, 15, 30, 0), buildPersona(), buildEmpleado(),
				buildServicio(), false);
	}	
	/**
	 * Objeto ComandoVenta 
	 * @return
	 */
	public ComandoVenta buildComandoVenta() {
		return new ComandoVenta(1, LocalDate.now(), buildCita(), 12000, 12000, 22000, false);
	}

	/**
	 * objeto Venta
	 */
	public Venta buildVenta() {
		return new Venta(1, LocalDate.now(), buildCita(), 10000, 10000, 20000, false);
	}
	

}
