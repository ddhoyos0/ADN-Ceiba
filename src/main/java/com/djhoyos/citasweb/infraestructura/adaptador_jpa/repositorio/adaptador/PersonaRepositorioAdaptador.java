package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.adaptador;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.djhoyos.citasweb.dominio.modelo.Persona;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioPersona;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.PersonaEntity;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.RepositorioPersonaJpa;

@Repository
public class PersonaRepositorioAdaptador implements RepositorioPersona {

    private final RepositorioPersonaJpa repositorioJpa;
    private ModelMapper modelMapper = new ModelMapper();

    public PersonaRepositorioAdaptador(RepositorioPersonaJpa repositorioJpa) {
        this.repositorioJpa = repositorioJpa;
    }


    @Override
    public Persona crear(Persona persona) {    	
        PersonaEntity personaEntity = modelMapper.map(persona, PersonaEntity.class);
        
        return modelMapper.map(repositorioJpa.save(personaEntity), Persona.class);
    }

    @Override
    public void actualizar(Persona persona) {
        PersonaEntity personaEntity = modelMapper.map(persona, PersonaEntity.class);
        repositorioJpa.save(personaEntity);
    }

    @Override
    public void eliminar(long id) {
        repositorioJpa.updatePersonaSetEstadoForId(true, id);
    }

    @Override
    public List<Persona> listar() {
        List<PersonaEntity> personaEntityList =  repositorioJpa.findByEstado(false);
        List<Persona> personaList = new ArrayList<>();

        for (PersonaEntity personaEntity : personaEntityList) {         
            Persona persona = modelMapper.map(personaEntity, Persona.class);
            personaList.add(persona);
        }
        return personaList;
    } 
}
