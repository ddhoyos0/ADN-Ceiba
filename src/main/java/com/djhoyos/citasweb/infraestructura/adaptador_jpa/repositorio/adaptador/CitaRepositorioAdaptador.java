package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.adaptador;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.djhoyos.citasweb.dominio.modelo.Cita;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioCita;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.CitaEntity;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.RepositorioCitaJpa;

@Repository
public class CitaRepositorioAdaptador implements RepositorioCita {
	
    private final RepositorioCitaJpa repositorioJpa;
    private ModelMapper modelMapper = new ModelMapper();

    public CitaRepositorioAdaptador(RepositorioCitaJpa repositorioJpa) {
        this.repositorioJpa = repositorioJpa;
    }

    @Override
    public Cita crear(Cita cita) {
        CitaEntity citaEntity = modelMapper.map(cita, CitaEntity.class);
        return modelMapper.map(this.repositorioJpa.save(citaEntity), Cita.class);
    }

    @Override
    public List<Cita> listar() {
        List<CitaEntity> repositorio = repositorioJpa.findByEstado(false);
        List<Cita> cita = new ArrayList<>();

        for (CitaEntity citaEntity : repositorio) {
            cita.add(modelMapper.map(citaEntity, Cita.class));
        }
        return cita;
    }

    @Override
    public List<Cita> findByEstado(boolean estado) {
        List<CitaEntity> repositorio = repositorioJpa.findByEstado(estado);
        List<Cita> cita = new ArrayList<>();

        for (CitaEntity citaEntity : repositorio) {
            cita.add(modelMapper.map(citaEntity, Cita.class));
        }
        return cita;
    }

    @Override
    public void eliminar(long id) {
    	repositorioJpa.updateCitaSetEstadoForId(true, id);       
    }
}
