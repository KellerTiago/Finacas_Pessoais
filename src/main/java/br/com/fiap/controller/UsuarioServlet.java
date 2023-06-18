package br.com.fiap.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Usuario;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.DAOFactory;
import br.com.fiap.util.CriptografiaUtils;

@WebServlet("/usuario")
public class UsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private UsuarioDAO dao;

	@Override
	public void init() throws ServletException {
		super.init();
		dao = DAOFactory.getUsuarioDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String nmUsuario = request.getParameter("nome-usuario");
			int idGrupo = Integer.parseInt(request.getParameter("nome-grupo"));
			String dsEmail = request.getParameter("email");
			String dsSenha = request.getParameter("senha");
			String dsSenha2 = request.getParameter("confirma-senha");
			Calendar dtInclusao = Calendar.getInstance();
			boolean status = Boolean.parseBoolean(request.getParameter("true"));

			if (dsSenha.equals(dsSenha2)) {

				Usuario usuario = new Usuario(0, idGrupo, nmUsuario, dsEmail, dsSenha, dtInclusao, status);
				dao.create(usuario);
				request.setAttribute("msg", "Usuario " + nmUsuario + " cadastrado com sucesso !");
				request.getRequestDispatcher("login-usuario.jsp").forward(request, response);
			} else {
				request.setAttribute("msg", "As senhas devem ser iguais !");
			}

		} catch (DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao cadastrar");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		request.getRequestDispatcher("cadastro-usuario.jsp").forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String dsEmail = request.getParameter("dsEmail");
			String dsSenha = request.getParameter("dsSenha");

			if (dao.read(dsEmail).getSenha().equals(CriptografiaUtils.criptografar(dsSenha))) {

				request.getRequestDispatcher("cadastro-objetivo.jsp").forward(request, response);

			} else {
				request.setAttribute("erro", "Verifique usuario e senha !");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		request.getRequestDispatcher("login-usuario.jsp").forward(request, response);
	}
}
