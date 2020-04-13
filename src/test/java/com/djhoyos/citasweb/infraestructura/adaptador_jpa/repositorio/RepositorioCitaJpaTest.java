package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Cita;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.CitaEntity;

@RunWith(SpringRunner.class)
@DataJpaTest
class RepositorioCitaJpaTest {
	
	@Autowired
	RepositorioCitaJpa repositorio;

	private ModelMapper modelMapper = new ModelMapper();
	
	TestDataBuilder datos = new TestDataBuilder();
	
	@Test
	@Transactional
	@Sql(scripts = "/datos.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    public void testRepositorio() {
		Cita cita = datos.buildCita();
        CitaEntity citaEntity = modelMapper.map(cita, CitaEntity.class);        
        repositorio.save(citaEntity);         
        assertNotNull(citaEntity.getId());
    }
}
