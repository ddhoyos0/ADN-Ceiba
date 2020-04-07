package com.djhoyos.citasweb.infraestructura.configuracion;

import com.djhoyos.citasweb.dominio.repositorio.RepositorioPersona;
import com.djhoyos.citasweb.dominio.servicio.persona.ServicioActualizarPersona;
import com.djhoyos.citasweb.dominio.servicio.persona.ServicioCrearPersona;
import com.djhoyos.citasweb.dominio.servicio.persona.ServicioEliminaPersona;
import com.djhoyos.citasweb.dominio.servicio.persona.ServicioListarPersona;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonaBean {

    @Bean
    public ServicioListarPersona servicioListarPersonaBean(RepositorioPersona repositorio) {
        return new ServicioListarPersona(repositorio);
    }

    @Bean
    public ServicioCrearPersona servicioCrearPersonaBean(RepositorioPersona repositorio) {
        return new ServicioCrearPersona(repositorio);
    }

    @Bean
    public ServicioEliminaPersona servicioEliminaPersonaBean(RepositorioPersona repositorio){
        return new ServicioEliminaPersona(repositorio);
    }

    @Bean
    public ServicioActualizarPersona servicioActualizarPersonaBean(RepositorioPersona repositorio){
        return  new ServicioActualizarPersona(repositorio);
    }
}
