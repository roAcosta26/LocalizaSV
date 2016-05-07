package com.rodrigo.localiza.framework;

import java.util.List;

public interface GenericService <T> 
{
	public T save (T entity);
	public T update(T entity, Integer id);
	public boolean delete (Integer id);
	public List<T> findAll();
	
}
