package com.rodrigo.localiza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.localiza.service.UsuarioService;

@Repository
public interface usuarioRepository extends JpaRepository<UsuarioService, Integer>{
	
}
