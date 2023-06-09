package br.com.fiap.factory;

import br.com.fiap.dao.ObjetivoDAO;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.dao.impl.OracleObjetivoDAO;
import br.com.fiap.dao.impl.OracleUsuarioDAO;

public class DAOFactory {
	
	public static UsuarioDAO getUsuarioDAO() {
		
		return new OracleUsuarioDAO();
		
	}
	
	public static ObjetivoDAO getObjetivoDAO() {
		
		return new OracleObjetivoDAO();
	}
}

