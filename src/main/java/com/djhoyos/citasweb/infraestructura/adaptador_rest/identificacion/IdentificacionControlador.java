package com.djhoyos.citasweb.infraestructura.adaptador_rest.identificacion;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.djhoyos.citasweb.aplicacion.comando.ComandoIdentificacion;
import com.djhoyos.citasweb.aplicacion.comando.manejador.identificacion.ManejadorCrearIdentificacion;
import com.djhoyos.citasweb.aplicacion.comando.manejador.identificacion.ManejadorListarIdentificacion;
import com.djhoyos.citasweb.dominio.modelo.Identificacion;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("identificacion")
public class IdentificacionControlador {

	private ManejadorCrearIdentificacion servicioCrear;
	private ManejadorListarIdentificacion servicioListar;

	public IdentificacionControlador(ManejadorCrearIdentificacion servicioCrear,
			ManejadorListarIdentificacion servicioListar) {
		this.servicioCrear = servicioCrear;
		this.servicioListar = servicioListar;
	}
	
    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<Identificacion> listarEstado(){
        return this.servicioListar.ejecutar();
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ComandoIdentificacion comando) {    	
        servicioCrear.crear(comando);
    }
}
