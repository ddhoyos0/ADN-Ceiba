package com.djhoyos.citasweb.infraestructura.adaptador_rest.servicio;

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

import com.djhoyos.citasweb.aplicacion.comando.ComandoServicio;
import com.djhoyos.citasweb.aplicacion.comando.manejador.servicio.ManejadorActualizarServicio;
import com.djhoyos.citasweb.aplicacion.comando.manejador.servicio.ManejadorCrearServicio;
import com.djhoyos.citasweb.aplicacion.comando.manejador.servicio.ManejadorEliminarServicio;
import com.djhoyos.citasweb.aplicacion.comando.manejador.servicio.ManejadorListarServicio;
import com.djhoyos.citasweb.dominio.modelo.Servicio;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/servicio")
public class ServicioControlador {

    private ManejadorCrearServicio servicioCrear;
    private ManejadorActualizarServicio servicioActualizar;
    private ManejadorEliminarServicio servicioEliminar;
    private ManejadorListarServicio servicioListar;

    public ServicioControlador(
            ManejadorActualizarServicio servicioActualizar,
            ManejadorCrearServicio servicioCrear,
            ManejadorEliminarServicio servicioEliminar,
            ManejadorListarServicio servicioListar
    ) {
        this.servicioActualizar = servicioActualizar;
        this.servicioCrear = servicioCrear;
        this.servicioEliminar = servicioEliminar;
        this.servicioListar = servicioListar;
    }

    @PostMapping( "/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ComandoServicio comando) {
        servicioCrear.crear(comando);
    }

    @PutMapping("/actualizar")
    @ResponseStatus(HttpStatus.OK)
    public void actualizar(@RequestBody ComandoServicio comando){
        servicioActualizar.actualiza(comando);
    }

    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<Servicio> listar(){
        return servicioListar.ejecutar();
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public  void eliminar(@PathVariable long id) {
        servicioEliminar.eliminar(id);
    }
}
