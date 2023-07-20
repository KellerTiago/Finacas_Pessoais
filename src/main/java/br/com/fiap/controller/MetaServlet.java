package br.com.fiap.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Meta;
import br.com.fiap.bean.Objetivo;
import br.com.fiap.bean.Recorrencia;
import br.com.fiap.dao.MetaDAO;
import br.com.fiap.dao.ObjetivoDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.DAOFactory;

@WebServlet("/Meta")
public class MetaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private MetaDAO metaDao;
	private ObjetivoDAO objetivoDAO;
	//private RecorrenciaDAO recorrenciaDAO; criar ela aqui

	@Override
	public void init() throws ServletException {
		super.init();
		metaDao = DAOFactory.getMetaDAO();
		objetivoDAO = DAOFactory.getObjetivoDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("abrirFormMeta");

		switch (acao) {
		case "abrirFormMeta":
			abrirFormMeta(request, response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String acao = request.getParameter("abrirFormMeta");
		
		switch (acao) {			
		case "cadastrar":
			cadastrarMeta(request, response);
			break;
		}

	}

	private void abrirFormMeta(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Objetivo> lista = objetivoDAO.readAll();
		request.setAttribute("objetivos", lista);
		request.getRequestDispatcher("cadastro-meta.jsp").forward(request, response);
	}
	
	private void cadastrarMeta(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		
		try {
			
			//Cadastro da recorrencia
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			java.util.Date dtInicio = format.parse(request.getParameter("data-inicio"));
			java.util.Date dtFim = format.parse(request.getParameter("data-fim"));
			double vrRecorrencia = Double.parseDouble("valor-meta");
			Recorrencia recorrencia = new Recorrencia();
			//recorrenciaDAO.create(recorrencia);
			
			
			//Cadastro da meta
			 int idObjetivo = Integer.parseInt(request.getParameter("nome-objetivo"));
			 int idCategoria = Integer.parseInt(request.getParameter("nome-categoria"));
			 String dsMeta = request.getParameter("meta");
			 double vrMeta = Double.parseDouble("valor-meta");
			 int idRecorrencia = Integer.parseInt(request.getParameter("Colocar a recorrencia"));
			 Meta meta = new Meta(0,idObjetivo,idCategoria,idRecorrencia,dsMeta,vrMeta,null,1);
			 
			 metaDao.create(meta);
			 

			
		} catch (Exception db) {
			db.printStackTrace();
		}
		
	}

}
