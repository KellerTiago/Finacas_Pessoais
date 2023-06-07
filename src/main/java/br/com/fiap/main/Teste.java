package br.com.fiap.main;


import java.util.Calendar;

import br.com.fiap.bean.Usuario;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.DAOFactory;

public class Teste {

	public static void main(String[] args) {
		
		UsuarioDAO dao = DAOFactory.getUsuarioDAO();

		try {
			
			Usuario usuario = new Usuario();
			
			usuario.setIdUsuario(3);
			usuario.setUsuarioGrupo(1);
			usuario.setNmUsuario("keller");
			usuario.setSenha("12345");
			usuario.setEmail("kellertiago@hotmail.com");
			usuario.setDtInclusao(Calendar.getInstance());
			
			usuario.setStatus(false);
			
			dao.create(usuario);
			System.out.println("Produto cadastrado.");
		} catch (DBException e) {
			e.printStackTrace();     
		}
	}

}
