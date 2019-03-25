package com.apps.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.apps.models.entity.Cliente;
import com.apps.models.entity.Region;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliete);
	
	public void delete(Long id);
	
	public List<Region> findAllRegiones();

}
