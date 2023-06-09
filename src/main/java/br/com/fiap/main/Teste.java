package br.com.fiap.main;



import java.sql.Date;
import java.util.Calendar;

import br.com.fiap.bean.Objetivo;

import br.com.fiap.dao.ObjetivoDAO;

import br.com.fiap.exception.DBException;
import br.com.fiap.factory.DAOFactory;

public class Teste {

	public static void main(String[] args) {
		
		ObjetivoDAO dao = DAOFactory.getObjetivoDAO();

		try {
			
			Objetivo objetivo = new Objetivo();
			
			objetivo.setIdObjetivo(1);
			objetivo.setIdGrupo(1);
			objetivo.setDsObjetivo("First Objetivo");
		
			Date data = Date.valueOf("2023-05-01");
			
			
			objetivo.setDtInicio(data);
			objetivo.setDtFim(data);
			objetivo.setDtInclusao(Calendar.getInstance());
			objetivo.setStatus(1);
			
			dao.create(objetivo);
			System.out.println("Produto cadastrado.");
		} catch (DBException e) {
			e.printStackTrace();     
		}
	}

}
