package com.djhoyos.citasweb.dominio.modelo;


import com.djhoyos.citasweb.dominio.excepcion.ExcepcionesDominio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServicioTest {

    @Test
    public void crearObjetoServicio(){
        Servicio servicio = new Servicio();
        servicio.setId(1);
        servicio.setPrecio(25000);
        servicio.setTipo("Semipermanente");
        Assertions.assertEquals(servicio.toString(),servicio.toString());
    }

    @Test
    public void validarcampoTipoNoNulo(){
        Assertions.assertThrows(ExcepcionesDominio.class, () -> new Servicio(1,null,15000,false), "El tipo de servicio no puede ser vacio");
    }

    @Test
    public void validarCampoPrecioValorMayorACero(){
        Assertions.assertThrows(ExcepcionesDominio.class, () -> new Servicio(1,"pedicure",0,false), "El precio no puede ser menor o igual a cero ");
    }
}