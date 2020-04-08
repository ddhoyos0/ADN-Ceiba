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
import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CitasWebApplication.class)
@AutoConfigureMockMvc
@TestPropertySource("/test.properties")
public class EmpleadoControladorTest{
    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private MockMvc mockMvc;
    
    @Autowired
    private ObjectMapper objectMapper;
    

    private TestDataBuilder datosBuilder = new TestDataBuilder();

    @BeforeEach
    public void inicio(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();      
    }
/*
    @Test
    public void CrearEmpleado() throws Exception {
        ComandoEmpleado comando = datosBuilder.buildComandoEmpleado();
        mockMvc.perform(post("/empleado/crear")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comando))
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated());
    }
    
    @Test
    public void actualizarEmpleado() throws Exception{
    	ComandoEmpleado comando = datosBuilder.buildComandoEmpleado();
        MvcResult mvcResult = mockMvc.perform(put("/empleado/actualizar")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comando)))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(200, status);
    }*/

    @Test
    public void ConsultaEmpleado() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/empleado/listar")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(200, status);

    }
	@Test
	public void eliminarEmpleado() throws Exception {
		MvcResult mvcResult = mockMvc
				.perform(delete("/empleado/eliminar/1").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		Assertions.assertEquals(200, status);

	}
}
