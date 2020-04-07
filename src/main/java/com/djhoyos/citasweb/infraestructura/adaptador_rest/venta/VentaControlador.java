package com.djhoyos.citasweb.infraestructura.adaptador_rest.venta;

import com.djhoyos.citasweb.aplicacion.comando.ComandoVenta;
import com.djhoyos.citasweb.aplicacion.comando.manejador.venta.ManejadorCrearVenta;
import com.djhoyos.citasweb.aplicacion.comando.manejador.venta.ManejadorEliminarVenta;
import com.djhoyos.citasweb.aplicacion.comando.manejador.venta.ManejadorListarVenta;
import com.djhoyos.citasweb.dominio.modelo.Venta;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/venta")
public class VentaControlador {

    private ManejadorCrearVenta crearVenta;
    private ManejadorListarVenta listarVenta;
    private ManejadorEliminarVenta eliminarVenta;

    VentaControlador(
            ManejadorCrearVenta crearVenta,
            ManejadorListarVenta listarVenta,
            ManejadorEliminarVenta eliminarVenta
    ){
        this.crearVenta = crearVenta;
        this.listarVenta = listarVenta;
        this.eliminarVenta = eliminarVenta;
    }

    @PostMapping( "/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ComandoVenta comando) {
        crearVenta.crear(comando);
    }

    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<Venta> listar(){
        return listarVenta.listar();
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public  void eliminar(@PathVariable int id) {
        eliminarVenta.eliminar(id);
    }

}
