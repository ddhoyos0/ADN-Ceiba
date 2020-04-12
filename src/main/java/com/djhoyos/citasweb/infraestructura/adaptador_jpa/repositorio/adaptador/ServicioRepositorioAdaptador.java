package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.adaptador;

import com.djhoyos.citasweb.dominio.modelo.Servicio;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioServicio;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.ServicioEntity;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.RepositorioServicioJpa;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ServicioRepositorioAdaptador implements RepositorioServicio {

	private final RepositorioServicioJpa repositorioJpa;
	private ModelMapper modelMapper = new ModelMapper();

	public ServicioRepositorioAdaptador(RepositorioServicioJpa repositorioJpa) {
		this.repositorioJpa = repositorioJpa;
	}

	@Override
	public void crear(Servicio servicio) {
		ServicioEntity servicioEntity = modelMapper.map(servicio, ServicioEntity.class);
		this.repositorioJpa.save(servicioEntity);
	}

	@Override
	public List<Servicio> listar() {
		List<ServicioEntity> repositorio = repositorioJpa.findByEstado(false);
		List<Servicio> servicios = new ArrayList<>();

		for (ServicioEntity servicioEntity : repositorio) {
			servicios.add(modelMapper.map(servicioEntity, Servicio.class));
		}
		return servicios;
	}

	@Override
	public void eliminar(long id) {
		this.repositorioJpa.updateServicioSetEstadoForId(true, id);
	}
}
