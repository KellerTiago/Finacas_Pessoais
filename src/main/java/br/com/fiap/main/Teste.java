package br.com.fiap.main;

import java.util.List;

import br.com.fiap.bean.Objetivo;
import br.com.fiap.dao.ObjetivoDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.DAOFactory;

public class Teste {



	public static void main(String[] args) throws DBException {
		ObjetivoDAO dao = DAOFactory.getObjetivoDAO();

		List<Objetivo> lista = dao.readAll();
		for (Objetivo objetivo : lista) {
			System.out.println(objetivo.getIdObjetivo() + " " + objetivo.getDsObjetivo());
		}
	}
}
