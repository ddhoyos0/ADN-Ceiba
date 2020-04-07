package com.djhoyos.citasweb.infraestructura.controlador;

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
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.djhoyos.citasweb.CitasWebApplication;
import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CitasWebApplication.class)
@AutoConfigureMockMvc
@TestPropertySource("/test.properties")
public class ServicioControladorTest {
    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    private TestDataBuilder datosBuilder = new TestDataBuilder();

    @BeforeEach
    public void inicio(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void peticionPostCrearServicio() throws Exception {
        //arrange
        ComandoServicio comando = datosBuilder.buildComandoServicio();

        //Act-Assert
        mockMvc.perform(post("/servicio/crear")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comando))
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    public void peticionPutActualizarServicio() throws Exception{
        MvcResult mvcResult = mockMvc.perform(put("/servicio/actualizar")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(new ComandoServicio(1,"Pedicure",15000,false))))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(200, status);
    }
    @Test
    public void peticionConsultaServicio() throws Exception {

        //arrange
        ComandoServicio servicio = datosBuilder.buildComandoServicio();

        mockMvc.perform(post("/servicio/crear")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(servicio))
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated());

        //Act
        MvcResult mvcResult = mockMvc.perform(get("/servicio/listar")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(200, status);

    }
	@Test
	public void peticionEliminarServicio() throws Exception {
		MvcResult mvcResult = mockMvc
				.perform(delete("/servicio/eliminar/1").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		Assertions.assertEquals(200, status);

	}

}
