package com.djhoyos.citasweb.infraestructura.adaptador_rest.identificacion;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource("/test.properties")
public class PersonaControladorTest {

	@Autowired
	private WebApplicationContext wac;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	private TestDataBuilder datosBuilder;

	@BeforeEach
	public void inicio() {
		datosBuilder = new TestDataBuilder();
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	@Transactional
	@Sql(scripts = "/datos.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void CrearPersona() throws Exception {
		ComandoPersona comando = datosBuilder.buildComandoPersona();
		mockMvc.perform(post("/persona/crear").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(comando)).accept(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isCreated());
	}
	
	@Test
	@Transactional
	@Sql(scripts = "/datos.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void ActualizarPersona() throws Exception {
		ComandoPersona comando = new ComandoPersona(1,datosBuilder.buildDocumento(),"1077625434","Jose carlos Hoyos","3224567893","Calle 64 # 24-32","jose9@gmail.com");	
		MvcResult mvcResult = mockMvc.perform(put("/persona/actualizar").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(comando))).andReturn();
		int status = mvcResult.getResponse().getStatus();
		Assertions.assertEquals(200, status);
	}
	
	@Test
	public void ConsultaPersona() throws Exception {
		MvcResult mvcResult = mockMvc.perform(
				get("/persona/listar").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		Assertions.assertEquals(200, status);

	}

	@Test
	public void eliminarPersona() throws Exception {
		MvcResult mvcResult = mockMvc.perform(delete("/persona/eliminar/1").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andReturn();
		int status = mvcResult.getResponse().getStatus();
		Assertions.assertEquals(200, status);

	}
}
