package br.com.fiap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Objetivo;
import br.com.fiap.dao.MetaDAO;
import br.com.fiap.dao.ObjetivoDAO;
import br.com.fiap.factory.DAOFactory;

@WebServlet("/Meta")
public class MetaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private MetaDAO dao;
	private ObjetivoDAO objetivoDAO;

	@Override
	public void init() throws ServletException {
		super.init();
		dao = DAOFactory.getMetaDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");

		switch (acao) {
		case "cadastrar":
			abrirFormMeta(request, response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	private void abrirFormMeta(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Objetivo> lista = objetivoDAO.readAll();
		request.setAttribute("objetivos", lista);
		request.getRequestDispatcher("cadstro-meta.jsp").forward(request, response);
	}

}
