package com.djhoyos.citasweb.dominio.servicio.venta;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioVenta;

public class ServicioEliminarVenta {

    private final RepositorioVenta repositorio;

    public ServicioEliminarVenta(RepositorioVenta repositorio) {
        this.repositorio = repositorio;
    }

    public void eliminar(long id){
        repositorio.eliminar(id);
    }
}
