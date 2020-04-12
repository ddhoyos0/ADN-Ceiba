package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.djhoyos.citasweb.aplicacion.comando.ComandoIdentificacion;
import com.djhoyos.citasweb.databuider.TestDataBuilder;
import com.djhoyos.citasweb.dominio.modelo.Identificacion;

class FabricaIdentificacionTest {
	
	TestDataBuilder dataBuilder;
    ComandoIdentificacion comando;
    Identificacion identificacion;

    @BeforeEach
    public void inicio() {
        identificacion = new Identificacion();
        dataBuilder = new TestDataBuilder();
    }
    
    @Test
   public void validandoFabrica() {
        comando = new ComandoIdentificacion(1,"Cedula de ciudadania");
        identificacion = FabricaIdentificacion.modelo(comando);       
        assertNotNull(identificacion);
    }
}
