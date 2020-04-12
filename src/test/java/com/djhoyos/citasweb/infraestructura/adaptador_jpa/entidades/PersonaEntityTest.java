package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.Resource;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Persona;

class PersonaEntityTest {
	@Resource
    private PersonaEntity personaEntity;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	public TestDataBuilder datos;
	public Persona persona;
	public IdentificacionEntity documentoEntity;
	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		persona = new Persona();
		personaEntity = new PersonaEntity();
		documentoEntity = new IdentificacionEntity(1,"Celular de ciudadania");
	}
     
    @Test
    public void validarLaEntidadCita() {
    	persona = datos.buildPersona();
    	personaEntity = modelMapper.map(persona, PersonaEntity.class);
        assertEquals(persona.getCelular(), personaEntity.getCelular());
    }

    @Test
	public void validarMetodoSet(){
		PersonaEntity persona = new PersonaEntity();
		persona.setId(1);
		persona.setIdentificacion(documentoEntity);
		persona.setDocumento("1066732570");
		persona.setNombre("jose cantillo");
		persona.setDireccion("Calle 67 # 42-34");
		persona.setCelular("3006557432");
		persona.setEmail("jose@gmail.com");
		persona.setEstado(false);
		assertEquals(documentoEntity, persona.getIdentificacion());
		assertEquals("1066732570", persona.getDocumento());
		assertEquals("jose cantillo",persona.getNombre());
		assertEquals("Calle 67 # 42-34",persona.getDireccion());
		assertEquals("3006557432",persona.getCelular());
		assertEquals("jose@gmail.com",persona.getEmail());
		assertFalse(persona.isEstado());


	}
}
