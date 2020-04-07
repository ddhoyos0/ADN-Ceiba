package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.Resource;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Cita;

class CitaEntityTest {
	
	@Resource
    private CitaEntity citaEntity;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	public TestDataBuilder datos;
	public Cita cita;	
	
	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		cita = new Cita();
		citaEntity = new CitaEntity();
	}
     
    @Test
    public void validarLaEntidadCita() {
    	cita = datos.buildCita();
        citaEntity = modelMapper.map(cita, CitaEntity.class);
        assertEquals(cita.getId(), citaEntity.getId());
    }

}
