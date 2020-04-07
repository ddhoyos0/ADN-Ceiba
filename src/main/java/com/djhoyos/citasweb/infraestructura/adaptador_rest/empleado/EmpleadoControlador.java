package com.djhoyos.citasweb.infraestructura.adaptador_rest.empleado;

import com.djhoyos.citasweb.aplicacion.comando.ComandoEmpleado;
import com.djhoyos.citasweb.aplicacion.comando.manejador.empleado.ManejadorActualizarEmpleado;
import com.djhoyos.citasweb.aplicacion.comando.manejador.empleado.ManejadorCrearEmpleado;
import com.djhoyos.citasweb.aplicacion.comando.manejador.empleado.ManejadorEliminarEmpleado;
import com.djhoyos.citasweb.aplicacion.comando.manejador.empleado.ManejadorListarEmpleado;
import com.djhoyos.citasweb.dominio.modelo.Empleado;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("empleado")
public class EmpleadoControlador {
    private ManejadorCrearEmpleado servicioCrear;
    private ManejadorActualizarEmpleado servicioActualizar;
    private ManejadorEliminarEmpleado servicioEliminar;
    private ManejadorListarEmpleado servicioListar;

    public EmpleadoControlador(
            ManejadorCrearEmpleado servicioCrear,
            ManejadorActualizarEmpleado servicioActualizar,
            ManejadorEliminarEmpleado servicioEliminar,
            ManejadorListarEmpleado servicioListar
    ) {
        this.servicioCrear = servicioCrear;
        this.servicioActualizar = servicioActualizar;
        this.servicioEliminar = servicioEliminar;
        this.servicioListar = servicioListar ;
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ComandoEmpleado comando) {
        this.servicioCrear.crear(comando);
    }

    @PutMapping("/actualizar")
    @ResponseStatus(HttpStatus.OK)
    public void actualizar(@RequestBody ComandoEmpleado comando){
        this.servicioActualizar.actualiza(comando);
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void eliminar(@PathVariable long id) {
        this.servicioEliminar.eliminar(id);
    }

    @GetMapping(value = "/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<Empleado> listar(){
        return this.servicioListar.ejecutar();
    }
}
