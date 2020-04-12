package com.djhoyos.citasweb.dominio.servicio.venta;

import com.djhoyos.citasweb.dominio.modelo.Venta;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioVenta;

public class ServicioCrearVenta {
    private final RepositorioVenta repositorio;

    public ServicioCrearVenta(RepositorioVenta repositorio) {
        this.repositorio = repositorio;
    }

    public void crear(Venta venta) {
        this.repositorio.crear(venta);
    }
}
