package com.djhoyos.citasweb.dominio.repositorio;

import com.djhoyos.citasweb.dominio.modelo.Venta;

import java.util.List;

public interface RepositorioVenta {
    Venta crear(Venta venta);
    List<Venta> listar();
    void eliminar(long id);
    List<Venta> findByEstado(boolean estado);
}
