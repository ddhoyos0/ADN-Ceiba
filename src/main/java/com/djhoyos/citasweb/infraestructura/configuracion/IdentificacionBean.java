package com.djhoyos.citasweb.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioIdentificacion;
import com.djhoyos.citasweb.dominio.servicio.identificacion.ServicioCrearIdentificacion;
import com.djhoyos.citasweb.dominio.servicio.identificacion.ServicioListarIdentificacion;

@Configuration
@EnableTransactionManagement
public class IdentificacionBean {
    @Bean
    public ServicioListarIdentificacion servicioListarIdentificacionBean(RepositorioIdentificacion repositorio) {
        return new ServicioListarIdentificacion(repositorio);
    }

    @Bean
    public ServicioCrearIdentificacion servicioCrearIdentificacionBean(RepositorioIdentificacion repositorio) {
        return new ServicioCrearIdentificacion(repositorio);
    }
}
