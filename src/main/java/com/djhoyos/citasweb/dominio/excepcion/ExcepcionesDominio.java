package com.djhoyos.citasweb.dominio.excepcion;

public class ExcepcionesDominio extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionesDominio(String mensaje){
        super(mensaje);
    }
}
