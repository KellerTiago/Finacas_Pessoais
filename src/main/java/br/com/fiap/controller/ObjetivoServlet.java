package br.com.fiap.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Objetivo;
import br.com.fiap.dao.ObjetivoDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.DAOFactory;



@WebServlet("/objetivo")
public class ObjetivoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private ObjetivoDAO dao;

	@Override
	public void init() throws ServletException {
		super.init();
		dao = DAOFactory.getObjetivoDAO();
	}



    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String acao = request.getParameter("acao");

		switch (acao) {
		case "cadastrar":
			cadastrar(request, response);
			break;
			
		case "editar":
			editar(request,response);
			break;
		
		case "excluir":
			excluir(request,response);
		
		}
		
		
	}


	private void excluir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idObjetivo = Integer.parseInt(request.getParameter("codigo"));
		
		try {
			dao.delete(idObjetivo);
			request.setAttribute("msg", "Objetivo Excluido!");
			
		} catch (DBException e) {
			e.printStackTrace();
			request.setAttribute("erro", "Erro ao excluir!");
		}
		listar(request, response);	
	}



	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		
 			String dsObjetivo = request.getParameter("nome-objetivo");
 			double vrObjetivo = Double.parseDouble(request.getParameter("valor"));
 			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
 			java.util.Date dataInicio = format.parse(request.getParameter("data-inicio"));
 			java.util.Date dataFim = format.parse(request.getParameter("data-fim"));

 			Objetivo objetivo = new Objetivo(0, 0, dsObjetivo, vrObjetivo, new java.sql.Date(dataInicio.getTime()), new java.sql.Date(dataFim.getTime()), null, 1);

 			dao.create(objetivo);

 			request.setAttribute("msg", "Objetivo cadastrado com sucesso!");
 		} catch (DBException db) {
 			db.printStackTrace();
 			request.setAttribute("erro", "Erro ao cadastrar");
 		} catch (Exception e) {
 			e.printStackTrace();
 			request.setAttribute("erro", "Por favor, valide os dados");
 		}
 		request.getRequestDispatcher("cadastro-objetivo.jsp").forward(request, response);
	}
	
    private void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		    int idObjetivo = Integer.parseInt(request.getParameter("codigo"));
			String dsObjetivo = request.getParameter("nome-objetivo");
 			double vrObjetivo = Double.parseDouble(request.getParameter("valor"));
 			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
 			java.util.Date dataInicio = format.parse(request.getParameter("data-inicio"));
 			java.util.Date dataFim = format.parse(request.getParameter("data-fim"));


 			Objetivo objetivo = new Objetivo(idObjetivo, 0, dsObjetivo, vrObjetivo, new java.sql.Date(dataInicio.getTime()), new java.sql.Date(dataFim.getTime()), null, 1);
 			dao.update(objetivo);
 	        request.setAttribute("msg", "Objetivo atualizado!");
 	        
	    } catch (DBException db) {
	        db.printStackTrace();
	        request.setAttribute("erro", "Erro ao atualizar");
	    } catch (Exception e) {
	        e.printStackTrace();
	        request.setAttribute("erro", "Por favor, valide os dados");
	    }
		listar(request, response);	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String acao = request.getParameter("acao");
		    
			switch (acao) {
			case "listar":
				listar(request, response);
				break;
			
			case "abrir-alterar":
				int idobjetivo = Integer.parseInt(request.getParameter("codigo"));
				Objetivo objetivo = dao.read(idobjetivo);
				request.setAttribute("objetivo", objetivo);
				request.getRequestDispatcher("alteracao-objetivo.jsp").forward(request, response);
			}	
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Objetivo> lista = dao.readAll();
		request.setAttribute("objetivos", lista);
		request.getRequestDispatcher("lista-objetivo.jsp").forward(request, response);
	}

}
