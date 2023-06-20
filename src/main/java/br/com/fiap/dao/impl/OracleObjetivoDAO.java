package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.bean.Objetivo;
import br.com.fiap.dao.ObjetivoDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.singleton.ConnectionManager;


public class OracleObjetivoDAO implements ObjetivoDAO {

	private Connection conexao;

	@Override
	public void create(Objetivo objetivo) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();
			
	
			String sql = "INSERT INTO t_fth_objetivo (id_objetivo, id_grupo, ds_objetivo, vr_objetivo, dt_inicio, dt_fim, dt_inclusao, status) VALUES (SQ_FTH_OBJETIVO_IDOBJETIVO.NEXTVAL,?,?,?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, 1); //instancia de grupo padrão arrumar
			stmt.setString(2, objetivo.getDsObjetivo());
			stmt.setDouble(3, objetivo.getVrObjetivo());
			stmt.setDate(4, objetivo.getDtInicio());
			stmt.setDate(5, objetivo.getDtFim());
			Calendar dtInclusao = Calendar.getInstance();
			java.sql.Date dtInclusaoSql = new java.sql.Date(dtInclusao.getTimeInMillis());
			stmt.setDate(6, dtInclusaoSql);
			stmt.setInt(7, objetivo.isStatus());

			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Erro ao tentar cadastrar o objetivo!");
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
	public void update(Objetivo objetivo) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "UPDATE t_fth_objetivo SET ds_objetivo = ?, vr_objetivo = ?, dt_inicio = ?, dt_fim = ?, status = ? WHERE id_objetivo = ?";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, objetivo.getDsObjetivo());
			stmt.setDouble(2, objetivo.getVrObjetivo());
			stmt.setDate(3, objetivo.getDtInicio());
			stmt.setDate(4, objetivo.getDtFim());
			stmt.setInt(5, objetivo.isStatus());
			stmt.setInt(6, objetivo.getIdObjetivo());
	
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Erro ao tentar alterar o objetivo!");
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
	public void delete(int idObjetivo) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "DELETE FROM t_fth_objetivo WHERE id_objetivo = ?";

			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idObjetivo);
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Erro ao tentar excluir o objetivo!");
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
	public Objetivo read(int idObjetivo) {

		Objetivo objetivo = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT id_objetivo, id_grupo, ds_objetivo, vr_objetivo, dt_inicio, dt_fim, dt_inclusao, status FROM t_fth_objetivo WHERE id_objetivo = ?");
			stmt.setInt(1, idObjetivo);
			rs = stmt.executeQuery();

			if (rs.next()) {

				int idobjetivo = rs.getInt("id_objetivo");
				int idGrupo = rs.getInt("id_grupo");
				String dsObjetivo = rs.getString("ds_objetivo");
				double vrObjetivo = rs.getDouble("vr_objetivo");
				Date dtInicio = rs.getDate("dt_inicio");
				Date dtFim = rs.getDate("dt_fim");
				java.sql.Date data = rs.getDate("dt_inclusao");
				Calendar dtinclusao = Calendar.getInstance();
				dtinclusao.setTimeInMillis(data.getTime());
				int status = rs.getInt("status");

				objetivo = new Objetivo(idobjetivo, idGrupo, dsObjetivo, vrObjetivo, dtInicio, dtFim,dtinclusao, status);

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
		return objetivo;
	}

	@Override
	public List<Objetivo> readAll() {

		List<Objetivo> lista = new ArrayList<Objetivo>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			
			stmt = conexao.prepareStatement("SELECT id_objetivo, id_grupo, ds_objetivo, vr_objetivo, dt_inicio, dt_fim, dt_inclusao, status FROM t_fth_objetivo");
			rs = stmt.executeQuery();

			while (rs.next()) {

				int idObjetivo = rs.getInt("id_objetivo");
				int idGrupo = rs.getInt("id_grupo");
				String dsObjetivo = rs.getString("ds_objetivo");
				double vrObjetivo = rs.getDouble("vr_objetivo");
				Date dtInicio = rs.getDate("dt_inicio");
				Date dtFim = rs.getDate("dt_fim");
				java.sql.Date data = rs.getDate("dt_inclusao");
				Calendar dtinclusao = Calendar.getInstance();
				dtinclusao.setTimeInMillis(data.getTime());
				int status = rs.getInt("status");


				Objetivo objetivo = new Objetivo(idObjetivo, idGrupo, dsObjetivo, vrObjetivo, dtInicio, dtFim,dtinclusao, status);
				lista.add(objetivo);
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


