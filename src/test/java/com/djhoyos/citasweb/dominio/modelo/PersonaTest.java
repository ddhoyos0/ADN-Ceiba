package com.djhoyos.citasweb.dominio.modelo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.excepcion.ExcepcionesDominio;

public class PersonaTest {
    
	Identificacion documento;
    
    @BeforeEach
    public void before(){
        new TestDataBuilder();
        documento = new Identificacion();
        documento.setId(1);
        documento.setTipo("Nit");    
    }

    @Test
    public void crearObjetoPersona(){
        Persona persona = new Persona();
        persona.setId(1);
        persona.setIdentificacion(documento);
        persona.setDocumento("107783245");
        persona.setNombre("Jose fernando petro");
        persona.setCelular("3124567809");
        persona.setDireccion("Calle 23 # 90-32");
        persona.setEmail("admin@gmail.com");
        persona.setEstado(false);
        Assertions.assertEquals(persona,persona);

    }


    @Test
    public void validarcampoDocumentoNoNulo(){
        Assertions.assertThrows(ExcepcionesDominio.class, () -> 
        new Persona(1,documento,null,"Calor ramos","30087665252","Calle 45 # 23-12","admn@gmail.com"), "Documento es un campo obligatorio");
    }
    
    @Test
    public void validarcampoNombreNoNulo(){
        Assertions.assertThrows(ExcepcionesDominio.class, () -> 
        new Persona(1,documento,"1066723254",null,"30087665252","Calle 45 # 23-12","admn@gmail.com"), "Nombre es un campo obligatorio");
    }
    @Test
    public void validarcampoCelularNoNulo(){
        Assertions.assertThrows(ExcepcionesDominio.class, () -> 
        new Persona(1,documento,"1066723254","jorege murillo",null,"Calle 45 # 23-12","admn@gmail.com"), "El Celular es un campo obligatorio");
    }
}