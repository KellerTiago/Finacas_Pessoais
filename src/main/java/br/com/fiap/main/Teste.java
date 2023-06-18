package br.com.fiap.main;



import java.sql.Date;
import java.util.Calendar;

import br.com.fiap.bean.Objetivo;
import br.com.fiap.bean.Usuario;
import br.com.fiap.dao.ObjetivoDAO;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.DAOFactory;

public class Teste {

	public static void main(String[] args) {
		
		UsuarioDAO dao = DAOFactory.getUsuarioDAO();

		try {
			
			Usuario usuario = new Usuario();
			
			usuario = dao.read("keller@hotmail.com");
			
			 if (usuario != null) {
		            System.out.println("Usuário encontrado:");
		            System.out.println("ID: " + usuario.getIdUsuario());
		            System.out.println("ID Grupo: " + usuario.getUsuarioGrupo());
		            System.out.println("Nome: " + usuario.getNmUsuario());
		            System.out.println("Email: " + usuario.getEmail());
		            System.out.println("Senha: " + usuario.getSenha());
		            System.out.println("Data de Inclusão: " + usuario.getDtInclusao().getTime());
		            System.out.println("Status: " + usuario.isStatus());
		        } else {
		            System.out.println("Usuário não encontrado.");
		        }
		} catch (Exception e) {
			e.printStackTrace();     
		}
	}

}
