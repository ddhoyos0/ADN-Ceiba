package com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.adaptador;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.djhoyos.citasweb.dominio.modelo.Venta;
import com.djhoyos.citasweb.dominio.repositorio.RepositorioVenta;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.entidades.VentaEntity;
import com.djhoyos.citasweb.infraestructura.adaptador_jpa.repositorio.RepositorioVentaJpa;

@Repository
public class VentaRepositorioAdaptador implements RepositorioVenta {

	private final RepositorioVentaJpa repositorioJpa;
	private ModelMapper modelMapper = new ModelMapper();

	public VentaRepositorioAdaptador(RepositorioVentaJpa repositorioJpa) {
		this.repositorioJpa = repositorioJpa;
	}

	@Override
	public Venta crear(Venta venta) {
		VentaEntity ventaEntity = modelMapper.map(venta, VentaEntity.class);
		return modelMapper.map(this.repositorioJpa.save(ventaEntity), Venta.class);
	}

	@Override
	public List<Venta> listar() {
		List<VentaEntity> repositorio = repositorioJpa.findByEstado(false);
		List<Venta> venta = new ArrayList<>();

		for (VentaEntity ventaEntity : repositorio) {
			venta.add(modelMapper.map(ventaEntity, Venta.class));
		}
		return venta;
	}

	@Override
	public void eliminar(long id) {
		repositorioJpa.updateVentaSetEstadoForId(true, id);
	}

	@Override
	public List<Venta> findByEstado(boolean estado) {
		List<VentaEntity> repositorio = repositorioJpa.findByEstado(false);
		List<Venta> ventas = new ArrayList<>();

		for (VentaEntity ventaEntity : repositorio) {
			ventas.add(modelMapper.map(ventaEntity, Venta.class));
		}
		return ventas;
	}
}
