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
                
                if(dsSenha.equals(dsSenha2)) {
                	
                	Usuario usuario = new Usuario(0, idGrupo, nmUsuario, dsEmail, dsSenha, dtInclusao, status);
                	dao.create(usuario); 
                	request.setAttribute("msg", "Usuario " + nmUsuario + " cadastrado com sucesso !");
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
}
