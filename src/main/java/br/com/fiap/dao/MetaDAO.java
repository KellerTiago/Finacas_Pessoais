package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.bean.Meta;
import br.com.fiap.exception.DBException;

public interface MetaDAO {
	
	void create(Meta meta) throws DBException;
	
	void update(Meta meta) throws DBException;
	
	void delete(int meta) throws DBException;
	
	Meta read(int id_meta) throws DBException;
	
	List<Meta> readAll() throws DBException;
	

}
