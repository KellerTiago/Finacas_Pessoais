package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.bean.Objetivo;
import br.com.fiap.exception.DBException;

public interface ObjetivoDAO {
	
	void create(Objetivo objetivo) throws DBException;
	
	void update(Objetivo objetivo) throws DBException;
	
	void delete(int objetivo) throws DBException;
	
	Objetivo read(int id);
	
	List<Objetivo> readAll();

}
