package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Empleado;

class EmpleadoEntityTest {   
	
	private ModelMapper modelMapper = new ModelMapper();	
	public TestDataBuilder datos;
	public Empleado modelo;	
	 public EmpleadoEntity entidad;
	
	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		modelo = new Empleado();
		entidad = new EmpleadoEntity();
	}
     
    @Test
    public void validarLaEntidadEmpleado() {
    	modelo = datos.buildEmpleado();
    	entidad = modelMapper.map(modelo, EmpleadoEntity.class);
        assertEquals(modelo.getId(), entidad.getId());
    }

}
