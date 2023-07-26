package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.bean.Recorrencia;
import br.com.fiap.exception.DBException;

public interface RecorrenciaDAO {

	void create(Recorrencia recorrencia) throws DBException;

	void update(Recorrencia recorrencia) throws DBException;

	void delete(int recorrencia) throws DBException;

	Recorrencia read(int id);

	List<Recorrencia> readAll();

}
