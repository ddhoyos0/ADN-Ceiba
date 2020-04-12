package com.djhoyos.citasweb.infraestructura.adaptador_rest.persona;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.djhoyos.citasweb.aplicacion.comando.ComandoPersona;
import com.djhoyos.citasweb.aplicacion.comando.manejador.persona.ManejadorActualizarPersona;
import com.djhoyos.citasweb.aplicacion.comando.manejador.persona.ManejadorCrearPersona;
import com.djhoyos.citasweb.aplicacion.comando.manejador.persona.ManejadorEliminarPersona;
import com.djhoyos.citasweb.aplicacion.comando.manejador.persona.ManejadorListarPersona;
import com.djhoyos.citasweb.dominio.modelo.Persona;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/persona")
public class PersonaControlador {
	
    private ManejadorCrearPersona servicioCrear;
    private ManejadorActualizarPersona servicioActualizar;
    private ManejadorEliminarPersona servicioEliminar;
    private ManejadorListarPersona servicioListar;

    public PersonaControlador(
            ManejadorCrearPersona servicioCrear,
            ManejadorActualizarPersona servicioActualizar,
            ManejadorEliminarPersona servicioEliminar,
            ManejadorListarPersona servicioListar           
        ) {
        this.servicioCrear = servicioCrear;
        this.servicioActualizar = servicioActualizar;
        this.servicioEliminar = servicioEliminar;
        this.servicioListar = servicioListar ;
    }
    
    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ComandoPersona comando) {    	
        this.servicioCrear.ejecutar(comando);
    }

    @PutMapping("/actualizar")
    @ResponseStatus(HttpStatus.OK)
    public void actualizar(@RequestBody ComandoPersona comando){
        this.servicioActualizar.actualiza(comando);
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void eliminar(@PathVariable Integer id) {
        this.servicioEliminar.eliminar(id);
    }

    @GetMapping(value = "/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<Persona> listar(){
        return this.servicioListar.ejecutar();
    }
}
