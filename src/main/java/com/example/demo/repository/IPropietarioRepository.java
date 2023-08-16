package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Propietario;

public interface IPropietarioRepository {
	
	public void insertar(Propietario propietario);
	public void eliminar(Integer id);
	public Propietario seleccionarPorId(Integer id);
	public void actualizar(Propietario propietario);
	public List<Propietario> seleccionarTodos();
}
