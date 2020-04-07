package com.djhoyos.citasweb.infraestructura.adaptador_rest.cita;

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

import com.djhoyos.citasweb.aplicacion.comando.ComandoCita;
import com.djhoyos.citasweb.aplicacion.comando.manejador.cita.ManejadorActualizarCita;
import com.djhoyos.citasweb.aplicacion.comando.manejador.cita.ManejadorCrearCita;
import com.djhoyos.citasweb.aplicacion.comando.manejador.cita.ManejadorEliminarCita;
import com.djhoyos.citasweb.aplicacion.comando.manejador.cita.ManejadorListarCita;
import com.djhoyos.citasweb.dominio.modelo.Cita;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("cita")
public class CitaControlador {

    private ManejadorCrearCita servicioCrear;
    private ManejadorActualizarCita servicioActualizar;
    private ManejadorEliminarCita servicioEliminar;
    private ManejadorListarCita servicioListar;

    public CitaControlador(
            ManejadorCrearCita servicioCrear,
            ManejadorActualizarCita servicioActualizar,
            ManejadorEliminarCita servicioEliminar,
            ManejadorListarCita servicioListar
    ) {
        this.servicioCrear = servicioCrear;
        this.servicioActualizar = servicioActualizar;
        this.servicioEliminar = servicioEliminar;
        this.servicioListar = servicioListar ;
    }

    @PutMapping("/actualizar")
    @ResponseStatus(HttpStatus.OK)
    public void actualizar(@RequestBody ComandoCita comando){
        this.servicioActualizar.actualiza(comando);
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public  void eliminar(@PathVariable int id) {    	
        servicioEliminar.eliminar(id);
    }

    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<Cita> listar(){
        return this.servicioListar.ejecutar();
    }

    @GetMapping("/listar/{estado}")
    @ResponseStatus(HttpStatus.OK)
    public List<Cita> listarEstado(@PathVariable boolean estado){
        return this.servicioListar.listEstado(estado);
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ComandoCita comando) {    	
        servicioCrear.crear(comando);
    }
}
