package com.rodrigo.localiza.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.localiza.model.tipo_cliente;

@Repository
public interface Tipo_ClienteRepository extends JpaRepository<tipo_cliente, Integer> {
	
	List<tipo_cliente> findAllBy(String tipo_cliente_categoria);
	
	
}