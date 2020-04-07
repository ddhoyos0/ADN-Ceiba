package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.annotation.Resource;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Documento;

class DocumentoEntityTest {


	@Resource
    private DocumentoEntity documentoEntity;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	public TestDataBuilder datos;
	public Documento documento;	
	
	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		documento = new Documento(1,"Cedula");
		documentoEntity = new DocumentoEntity();
	}
     
    @Test
    public void validarEntidadCita() {
    	documentoEntity = modelMapper.map(documento, DocumentoEntity.class);
        assertEquals(documento.getId(), documentoEntity.getId());
    }

    @Test
	public void validandoMetodoSet(){
		DocumentoEntity documento = new DocumentoEntity();
		documento.setId(1);
		documento.setTipo("Cedula de Ciudadania");
		assertNotNull(documento);
	}

}
