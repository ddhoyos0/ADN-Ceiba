package com.djhoyos.citasweb.infraestructura.adaptador_rest.identificacion;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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

import com.djhoyos.citasweb.CitasWebApplication;
import com.djhoyos.citasweb.aplicacion.comando.ComandoVenta;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CitasWebApplication.class)
@AutoConfigureMockMvc
@TestPropertySource("/test.properties")
public class VentaControladorTest {
	@Autowired
	private WebApplicationContext wac;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;


	private TestDataBuilder datosBuilder;
    
    @BeforeEach
    public void inicio(){
    	datosBuilder = new TestDataBuilder();
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

	@Test
	@Transactional
	@Sql(scripts = "/datos.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void CrearPeticionPostVenta() throws Exception {

		// arrange
		ComandoVenta comando = datosBuilder.buildComandoVenta();

		// Act-Assert
		mockMvc.perform(post("/venta/crear").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(comando)).accept(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isCreated());
	}

	@Test
	public void peticionGetConsultaVenta() throws Exception {
		MvcResult mvcResult = mockMvc
				.perform(
						get("/venta/listar").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		Assertions.assertEquals(200, status);

	}

	@Test
	public void peticionDeleteVenta() throws Exception {
		MvcResult mvcResult = mockMvc.perform(
				delete("/venta/eliminar/1").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		Assertions.assertEquals(200, status);

	}
}
