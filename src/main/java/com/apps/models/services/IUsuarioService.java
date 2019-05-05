package com.apps.models.services;

import com.apps.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
