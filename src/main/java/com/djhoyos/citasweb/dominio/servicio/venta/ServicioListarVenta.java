package com.djhoyos.citasweb.dominio.servicio.venta;

import com.djhoyos.citasweb.dominio.modelo.Venta;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioVenta;

import java.util.List;

public class ServicioListarVenta {

    private final RepositorioVenta repositorio;

    public ServicioListarVenta(RepositorioVenta repositorio) {
        this.repositorio = repositorio;
    }

    public List<Venta> listar(){
        return repositorio.listar();
    }
}
