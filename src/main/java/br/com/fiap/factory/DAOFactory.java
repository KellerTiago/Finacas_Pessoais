package br.com.fiap.factory;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.dao.impl.OracleUsuarioDAO;

public class DAOFactory {
	
	public static UsuarioDAO getUsuarioDAO() {
		
		return new OracleUsuarioDAO();
		
	}
}

