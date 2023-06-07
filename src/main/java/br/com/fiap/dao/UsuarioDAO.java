package br.com.fiap.dao;

import java.util.List;
import br.com.fiap.bean.Usuario;
import br.com.fiap.exception.DBException;

public interface UsuarioDAO {
	
	void create(Usuario usuario) throws DBException;
	
	void update(Usuario usuario) throws DBException;
	
	void delete(int usuario) throws DBException;
	
	Usuario read(int id);
	
	List<Usuario> readAll();
}