package com.apps.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apps.models.entity.Cliente;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Long>{	
		
}
