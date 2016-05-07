package com.rodrigo.localiza.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.rodrigo.localiza.model.Usuario;
import com.rodrigo.localiza.repository.usuarioRepository;
import com.rodrigo.localiza.service.UsuarioService;

@Service
public class usuarioServiceImpl implements UsuarioService{
	@Autowired
	private usuarioRepository usuarioRepository;
	
	@Override
	public Usuario save(Usuario entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario update(Usuario entity, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	private SimpleJdbcCall userValidate;
	
	@Autowired
	public void setDataSource(DataSource dataSource)
	{
		this.userValidate = new SimpleJdbcCall(dataSource)
		.withProcedureName("userValidate");
	}	
	
	@Override
	public Integer userValidate(String usuario_nombre, String password) {
		// TODO Auto-generated method stub
		SqlParameterSource in = new MapSqlParameterSource().addValue("loginusername",usuario_nombre).addValue("loginpass",password);
		Map<String, Object> resul = userValidate.execute(in);
		Object response = resul.get("#result-set-1");
		String valoresArr = response.toString();
		String values = valoresArr.substring(9, 10);
		return Integer.valueOf(values);
	}
	


}
	