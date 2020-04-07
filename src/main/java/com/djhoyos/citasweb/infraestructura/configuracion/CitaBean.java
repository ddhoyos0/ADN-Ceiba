package com.djhoyos.citasweb.infraestructura.configuracion;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioCita;
import com.djhoyos.citasweb.dominio.servicio.cita.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class CitaBean {
    @Bean
    public ServicioListarCita servicioListarCitaBean(RepositorioCita repositorio) {
        return new ServicioListarCita(repositorio);
    }

    @Bean
    public ServicioCrearCita servicioCrearCitaBean(RepositorioCita repositorio) {
        return new ServicioCrearCita(repositorio);
    }

    @Bean
    public ServicioEliminarCita servicioEliminaCitaBean(RepositorioCita repositorio){
        return new ServicioEliminarCita(repositorio);
    }

    @Bean
    public ServicioActualizarCita servicioActualizarCitaBean(RepositorioCita repositorio){
        return  new ServicioActualizarCita(repositorio);
    }

}
