package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Servicio;

import static org.junit.jupiter.api.Assertions.*;

class ServicioEntityTest {

	private ModelMapper modelMapper = new ModelMapper();	
	public TestDataBuilder datos;
	public Servicio modelo;	
	public ServicioEntity entidad;
	
	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		modelo = new Servicio();
		entidad = new ServicioEntity();
	}
     
    @Test
    public void validarLaEntidadServicio() {
    	modelo = datos.buildServicio();
    	entidad = modelMapper.map(modelo, ServicioEntity.class);
        assertEquals(modelo.getId(), entidad.getId());
    }
	@Test
	public void validarMetodoSet(){
		ServicioEntity servicio = new ServicioEntity();
		servicio.setId(1);
		servicio.setPrecio(15000);
		servicio.setTipo("Cepillado");
		servicio.setEstado(false);
		assertEquals(	1, servicio.getId());
		assertEquals(15000,servicio.getPrecio());
		assertEquals("Cepillado", servicio.getTipo());
		assertFalse(servicio.isEstado());
	}
}
