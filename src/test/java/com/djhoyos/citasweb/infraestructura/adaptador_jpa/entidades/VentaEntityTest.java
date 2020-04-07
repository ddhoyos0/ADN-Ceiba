package com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Venta;

class VentaEntityTest {
	
	private ModelMapper modelMapper = new ModelMapper();	
	public TestDataBuilder datos;
	public Venta modelo;	
	public VentaEntity entidad;
	
	@BeforeEach
	public void inicio() {
		datos = new TestDataBuilder();
		modelo = new Venta();
		entidad = new VentaEntity();
	}
     
    @Test
    public void validarEntidadVenta() {
    	modelo = datos.buildVenta();
    	entidad = modelMapper.map(modelo, VentaEntity.class);
        assertEquals(modelo.getId(), entidad.getId());
    }


}
