package com.rodrigo.localiza.service;

import com.rodrigo.localiza.framework.GenericService;
import com.rodrigo.localiza.model.Usuario;

public interface UsuarioService extends GenericService<Usuario>{
	public Integer userValidate(String usuario_nombre, String password);
}
