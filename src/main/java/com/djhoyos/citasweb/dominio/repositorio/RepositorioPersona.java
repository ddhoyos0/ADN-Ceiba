package com.djhoyos.citasweb.dominio.repositorio;

import com.djhoyos.citasweb.dominio.modelo.Persona;

import java.util.List;

public interface RepositorioPersona {
    /**
     * metodo utilizado para crear Persona
     * @param persona
     */
    public void crear(Persona persona); 

    /**
     * metodo utilizado para eliminar persona
     * @param id
     */
    public void eliminar(long id);

    /**
     * metodo utilizado para listar personas
     * @return List<Persona>
     */
    public List<Persona> listar();


}
