package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.bean.Usuario;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.singleton.ConnectionManager;

public class OracleUsuarioDAO implements UsuarioDAO {

	private Connection conexao;

	@Override
	public void create(Usuario usuario) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "INSERT INTO t_fth_usuario (id_usuario, id_grupo, nm_usuario, ds_email, ds_senha, dt_inclusao, status ) VALUES (sq_fth_usuario_idusuario.nextval,?,?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);
			
			
			stmt.setInt(1, usuario.getUsuarioGrupo());
			stmt.setString(2, usuario.getNmUsuario());
			stmt.setString(3, usuario.getEmail());
			stmt.setString(4, usuario.getSenha());
			java.sql.Date dtInclusao = new java.sql.Date(usuario.getDtInclusao().getTimeInMillis());
			stmt.setDate(5, dtInclusao);
			stmt.setBoolean(6, usuario.isStatus());
			
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Erro ao tentar cadastrar o usuario!");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void update(Usuario usuario) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "UPDATE t_fth_usuario SET nm_usuario = ?, ds_email = ?, ds_senha = ?, dt_inclusao = ?, status = ? WHERE id_usuario = ?";

			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getIdUsuario());
			stmt.setInt(2, usuario.getUsuarioGrupo());
			stmt.setString(3, usuario.getNmUsuario());
			stmt.setString(4, usuario.getEmail());
			stmt.setString(5, usuario.getSenha());
			java.sql.Date dtInclusao = new java.sql.Date(usuario.getDtInclusao().getTimeInMillis());
			stmt.setDate(6, dtInclusao);
			stmt.setBoolean(7, usuario.isStatus());
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Erro ao tentar alterar o usuario!");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void delete(int idUsuario) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "DELETE FROM t_fth_usuario WHERE id_usuario = ?";

			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idUsuario);
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Erro ao tentar excluir o usuario!");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Usuario read(String dsEmail) {

		Usuario usuario = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT  id_usuario, id_grupo, nm_usuario, ds_email, ds_senha, dt_inclusao, status FROM t_fth_usuario WHERE ds_email = ?");
			stmt.setString(1, dsEmail);
			rs = stmt.executeQuery();

			if (rs.next()) {
				int idusuario = rs.getInt("id_usuario");
				int idGrupo = rs.getInt("id_grupo");
				String nmUsuario = rs.getString("nm_usuario");
				String dsemail = rs.getString("ds_email");
				String dsSenha = rs.getString("ds_senha");
				
				//analisar essa parte
				java.sql.Date data = rs.getDate("dt_inclusao");
				Calendar dtinclusao = Calendar.getInstance();
				dtinclusao.setTimeInMillis(data.getTime());
				
				boolean status = rs.getBoolean("status");

				usuario = new Usuario(idusuario, idGrupo, nmUsuario, dsemail, dsSenha, dtinclusao, status);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return usuario;
	}

	@Override
	public List<Usuario> readAll() {
		
		List<Usuario> lista = new ArrayList<Usuario>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT  id_usuario, id_grupo, nm_usuario, ds_email, ds_senha, dt_inclusao, status FROM t_fth_usuario WHERE id_usuario = ?");
			rs = stmt.executeQuery();

			//Percorre todos os registros encontrados
			while (rs.next()) {
				
				int idusuario = rs.getInt("id_usuario");
				int idGrupo = rs.getInt("id_grupo");
				String nmUsuario = rs.getString("nm_usuario");
				String dsEmail = rs.getString("ds_email");
				String dsSenha = rs.getString("ds_senha");
				java.sql.Date data = rs.getDate("dt_inclusao");
				Calendar dtinclusao = Calendar.getInstance();
				dtinclusao.setTimeInMillis(data.getTime());
				boolean status = rs.getBoolean("status");
				
				Usuario usuario = new Usuario(idusuario, idGrupo, nmUsuario, dsEmail, dsSenha, dtinclusao, status);
				lista.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}

}
