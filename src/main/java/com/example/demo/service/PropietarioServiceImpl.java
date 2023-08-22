package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository iPropietarioRepository;	
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardar(Propietario propietario) {
		this.iPropietarioRepository.insertar(propietario);
	}
	
	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void borrar(Integer id) {
		this.iPropietarioRepository.eliminar(id);
	}

	@Override
	public Propietario buscarPorId(Integer id) {
		return this.iPropietarioRepository.seleccionarPorId(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void actualizar(Propietario propietario) {
		this.iPropietarioRepository.actualizar(propietario);
		
	}

	@Override
	public List<Propietario> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.seleccionarTodos();
	}

}
