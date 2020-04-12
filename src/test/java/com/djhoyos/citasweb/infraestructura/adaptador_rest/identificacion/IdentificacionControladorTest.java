package com.djhoyos.citasweb.infraestructura.adaptador_rest.identificacion;

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
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.djhoyos.citasweb.CitasWebApplication;
import com.djhoyos.citasweb.aplicacion.comando.ComandoIdentificacion;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CitasWebApplication.class)
@AutoConfigureMockMvc
@TestPropertySource("/test.properties")
class IdentificacionControladorTest {

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
	public void CrearIdentificacion() throws Exception {	
		 ComandoIdentificacion comando = datosBuilder.buildComandoDocumento();
			//Act
			mockMvc.perform(post("/identificacion/crear")
					.contentType(MediaType.APPLICATION_JSON)
					.content(objectMapper.writeValueAsString(comando))
					.accept(MediaType.APPLICATION_JSON))
			.andDo(print())
			
			//Assert
			.andExpect(status().isCreated());
	    
	}
	
	@Test
    public void listarIdentificacion() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/identificacion/listar")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(200, status);

    }

}
