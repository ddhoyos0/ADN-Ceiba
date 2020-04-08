package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.dominio.modelo.Empleado;
import org.springframework.stereotype.Component;

@Component
public final class FabricaEmpleado {
	
	private FabricaEmpleado() {}
	
    public static Empleado modelo(ComandoEmpleado comando) {
        return new Empleado(
                comando.getId(),
                comando.getPorcentaje(),
                FabricaPersona.modelo(comando.getPersona()),
                comando.isEstado()
        );
    }    
}
