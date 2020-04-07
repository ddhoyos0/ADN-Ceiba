package com.djhoyos.citasweb.infraestructura.configuracion;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioVenta;
import com.djhoyos.citasweb.dominio.servicio.venta.ServicioCrearVenta;
import com.djhoyos.citasweb.dominio.servicio.venta.ServicioEliminarVenta;
import com.djhoyos.citasweb.dominio.servicio.venta.ServicioListarVenta;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VentaBean {
    @Bean
    public ServicioListarVenta servicioListarVentaBean(RepositorioVenta repositorio) {
        return new ServicioListarVenta(repositorio);
    }

    @Bean
    public ServicioCrearVenta servicioCrearVentaBean(RepositorioVenta repositorio) {
        return new ServicioCrearVenta(repositorio);
    }

    @Bean
    public ServicioEliminarVenta servicioEliminarVentaBean(RepositorioVenta repositorio){
        return new ServicioEliminarVenta(repositorio);
    }
}
