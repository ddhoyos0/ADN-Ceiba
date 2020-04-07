package com.djhoyos.citasweb.infraestructura.configuracion;


import com.djhoyos.citasweb.dominio.repositorio.RepositorioServicio;
import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioActualizarServicio;
import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioCrearServicio;
import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioEliminarServicio;
import com.djhoyos.citasweb.dominio.servicio.servicio.ServicioListarServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicioBean {
    @Bean
    public ServicioListarServicio servicioListarServicioBean(RepositorioServicio repositorio) {
        return new ServicioListarServicio(repositorio);
    }

    @Bean
    public ServicioCrearServicio servicioCrearServicioBean(RepositorioServicio repositorio) {
        return new ServicioCrearServicio(repositorio);
    }

    @Bean
    public ServicioEliminarServicio servicioEliminarServicioBean(RepositorioServicio repositorio){
        return new ServicioEliminarServicio(repositorio);
    }

    @Bean
    public ServicioActualizarServicio servicioActualizarServicioBean(RepositorioServicio repositorio){
        return  new ServicioActualizarServicio(repositorio);
    }
}
