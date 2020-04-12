package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.adaptador;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.djhoyos.citasweb.dominio.modelo.Identificacion;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioIdentificacion;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.IdentificacionEntity;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.RepositorioIdentificacionJpa;

@Repository
public class IdentificacionRepositorioAdaptador implements RepositorioIdentificacion {

	private final RepositorioIdentificacionJpa repositorioJpa;
	private ModelMapper modelMapper = new ModelMapper();

	public IdentificacionRepositorioAdaptador(RepositorioIdentificacionJpa repositorioJpa) {
		this.repositorioJpa = repositorioJpa;
	}

	@Override
	public void crear(Identificacion identificacion) {
		IdentificacionEntity entity = modelMapper.map(identificacion, IdentificacionEntity.class);
		this.repositorioJpa.save(entity);
	}

	@Override
	public List<Identificacion> listar() {
		List<IdentificacionEntity> repositorio = repositorioJpa.findAll();
		List<Identificacion> lista = new ArrayList<>();

		for (IdentificacionEntity entity : repositorio) {
			lista.add(modelMapper.map(entity, Identificacion.class));
		}
		return lista;
	}

}
