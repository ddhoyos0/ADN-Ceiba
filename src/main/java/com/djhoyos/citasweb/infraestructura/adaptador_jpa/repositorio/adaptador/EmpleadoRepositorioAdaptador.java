package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.adaptador;

import com.djhoyos.citasweb.dominio.modelo.Empleado;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioEmpleado;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.EmpleadoEntity;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.RepositorioEmpleadoJpa;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpleadoRepositorioAdaptador implements RepositorioEmpleado {

	private final RepositorioEmpleadoJpa repositorioJpa;
	private ModelMapper modelMapper = new ModelMapper();

	public EmpleadoRepositorioAdaptador(RepositorioEmpleadoJpa repositorioJpa) {
		this.repositorioJpa = repositorioJpa;
	}

	@Override
	public void crear(Empleado empleado) {
		EmpleadoEntity empleadoEntity = modelMapper.map(empleado, EmpleadoEntity.class);
		this.repositorioJpa.save(empleadoEntity);
	}

	@Override
	public List<Empleado> listar() {
		List<EmpleadoEntity> repositorio = repositorioJpa.findByEstado(false);
		List<Empleado> empleado = new ArrayList<>();

		for (EmpleadoEntity empleadoEntity : repositorio) {
			empleado.add(modelMapper.map(empleadoEntity, Empleado.class));
		}
		return empleado;
	}

	@Override
	public void eliminar(long id) {
		repositorioJpa.updateEmpleadoSetEstadoForId(true, id);
	}
}
