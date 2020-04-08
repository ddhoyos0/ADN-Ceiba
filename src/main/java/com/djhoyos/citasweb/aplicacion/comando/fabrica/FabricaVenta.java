package com.djhoyos.citasweb.aplicacion.comando.fabrica;

import com.djhoyos.citasweb.aplicacion.comando.ComandoVenta;
import com.djhoyos.citasweb.dominio.modelo.Venta;
import org.springframework.stereotype.Component;

@Component
public final class FabricaVenta {
	
	private FabricaVenta() {}
	
    public static Venta modelo(ComandoVenta comando) {
        return new Venta(
                comando.getId(),
                comando.getFecha(),
                FabricaCita.modelo(comando.getCita()),
                comando.getUtilidad(),
                comando.getComision(),
                comando.getTotal(),
                comando.isEstado()
        );
    }
  
}
