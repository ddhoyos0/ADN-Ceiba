package com.djhoyos.citasweb.dominio.utilidades;

import java.time.LocalDateTime;

import com.djhoyos.citasweb.dominio.excepcion.ExcepcionesDominio;

public final class Validaciones {

    private Validaciones() {
    }

    public static void menorIgualCero(int precio, String mensaje){
        if(precio <= 0 ) {
            throw new ExcepcionesDominio(mensaje);
        }
    }
    public static void validarFechaAnterior(LocalDateTime fecha, String mensaje){
        if(fecha.isBefore(LocalDateTime.now())){
            throw new ExcepcionesDominio(mensaje);
        }
    }
    public static void validarNoVacio(Object valor, String mensaje) {
        if(valor == null) {
            throw new ExcepcionesDominio(mensaje);
        }
    }
}
