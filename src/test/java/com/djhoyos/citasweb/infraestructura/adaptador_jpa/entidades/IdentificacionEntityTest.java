package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.annotation.Resource;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Identificacion;

class IdentificacionEntityTest {


	@Resource
    private IdentificacionEntity documentoEntity;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	public TestDataBuilder datos;
	public Identificacion documento;	
	
	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		documento = new Identificacion(1,"Cedula");
		documentoEntity = new IdentificacionEntity();
	}
     
    @Test
    public void validarEntidadCita() {
    	documentoEntity = modelMapper.map(documento, IdentificacionEntity.class);
        assertEquals(documento.getTipo(), documentoEntity.getTipo());
    }

    @Test
	public void validandoMetodoSet(){
		IdentificacionEntity documento = new IdentificacionEntity();
		documento.setId(1);
		documento.setTipo("Cedula de Ciudadania");
		assertNotNull(documento);
	}

}
