package com.djhoyos.citasweb.databuider;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import com.djhoyos.citasweb.aplicacion.comando.ComandoCita;
import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.aplicacion.comando.ComandoTipoDocumento;
import com.djhoyos.citasweb.aplicacion.comando.ComandoVenta;
import com.djhoyos.citasweb.dominio.modelo.Cita;
import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.modelo.Servicio;
import com.djhoyos.citasweb.dominio.modelo.Venta;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.CitaEntity;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.DocumentoEntity;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.EmpleadoEntity;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.PersonaEntity;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.ServicioEntity;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.VentaEntity;

public class TestDataBuilder {
	/**
	 * Objeto Documento
	 */
	private static final String TIPO = "Cedula de ciudadania";

	/**
	 * objeto Documento
	 */
	public ComandoTipoDocumento buildDocumento() {
		return new ComandoTipoDocumento(1, TIPO);
	}
	/**
	 * objeto DocumentoEntity
	 */
	public DocumentoEntity buildDocumentoEntity() {
		return new DocumentoEntity(1, TIPO);
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
		return new ComandoPersona(1, buildDocumento(), NUMERO, NOMBRE, CELULAR, DIRECCION, EMAIL, false);
	}

	/**
	 * objeto Persona
	 */
	public Persona buildPersona() {
		return new Persona(1, buildDocumento(), "10778324", "carlos ramos", "3225467890", "calle 34 # 43-34",
				"carlos@gmail.com", false);
	}

	/**
	 * objeto PersonaEntity
	 */
	public PersonaEntity buildPersonaEntity() {
		return new PersonaEntity(1, buildDocumentoEntity(), "10778324", "carlos ramos", "3225467890", "calle 34 # 43-34",
				"carlos@gmail.com", false);
	}
	/**
	 * Objeto ComandoEmpleado
	 * 
	 * @return
	 */
	public ComandoEmpleado buildComandoEmpleado() {
		return new ComandoEmpleado(1, PORCENTAJE, buildComandoPersona(), false);
	}

	/**
	 * objeto Empleado
	 */
	public Empleado buildEmpleado() {
		return new Empleado(1, PORCENTAJE, buildPersona(), false);
	}
	/**
	 * objeto EmpleadoEntity
	 */
	public EmpleadoEntity buildEmpleadoEntity() {
		return new EmpleadoEntity(1, PORCENTAJE, buildPersonaEntity(), false);
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
		return new Servicio(1, "Pedicure", 15000, false);
	}
	
	/**
	 * objecto ServicioEntity
	 * @return
	 */

	public ServicioEntity buildServicioEntity() {
		return new ServicioEntity(1, "Pedicure", 15000, false);
	}

	/**
	 * Objeto ComandoCita
	 */
	private static final LocalDateTime FECHA = LocalDateTime.of(2020, Month.DECEMBER, 30, 15, 30, 00);

	public ComandoCita buildComandoCita() {
		return new ComandoCita(1, FECHA, buildComandoPersona(), buildComandoEmpleado(), buildComandoServicio(), false);
	}

	/**
	 * objeto Cita
	 */
	public Cita buildCita() {
		return new Cita(1, LocalDateTime.of(2020, Month.DECEMBER, 30, 15, 30, 0), buildPersona(), buildEmpleado(),
				buildServicio(), false);
	}

	/**
	 *  Creacion de objeto CitaEntity
	 */
	public CitaEntity buildCitaEntity() {
		return new CitaEntity(1, LocalDateTime.of(2020, Month.DECEMBER, 30, 15, 30, 0), buildPersonaEntity(), buildEmpleadoEntity(),
				buildServicioEntity(), false);
	}
	
	/**
	 * Objeto ComandoVenta 
	 * @return
	 */
	public ComandoVenta buildComandoVenta() {
		return new ComandoVenta(1, LocalDate.now(), buildComandoCita(), 12000, 12000, 22000, false);
	}

	/**
	 * objeto Venta
	 */
	public Venta buildVenta() {
		return new Venta(1, LocalDate.now(), buildCita(), 10000, 10000, 20000, false);
	}
	
	/**
	 * objeto VentaEntity
	 */
	public VentaEntity buildVentaEntiy() {
		return new VentaEntity(1, LocalDate.now(), buildCitaEntity(), 10000, 10000, 20000, false);
	}
}
