package com.djhoyos.citasweb.infraestructura.configuracion;


import com.djhoyos.citasweb.dominio.repositorio.RepositorioEmpleado;
import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioActualizarEmpleado;
import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioCrearEmpleado;
import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioEliminarEmpleado;
import com.djhoyos.citasweb.dominio.servicio.empleado.ServicioListarEmpleado;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpleadoBean {
    @Bean
    public ServicioListarEmpleado servicioListarEmpleadoBean(RepositorioEmpleado repositorio) {
        return new ServicioListarEmpleado(repositorio);
    }

    @Bean
    public ServicioCrearEmpleado servicioCrearEmpleadoBean(RepositorioEmpleado repositorio) {
        return new ServicioCrearEmpleado(repositorio);
    }

    @Bean
    public ServicioEliminarEmpleado servicioEliminarEmpleadoBean(RepositorioEmpleado repositorio){
        return new ServicioEliminarEmpleado(repositorio);
    }

    @Bean
    public ServicioActualizarEmpleado servicioActualizarEmpleadoBean(RepositorioEmpleado repositorio){
        return  new ServicioActualizarEmpleado(repositorio);
    }
}
