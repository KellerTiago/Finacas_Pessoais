package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.bean.Recorrencia;
import br.com.fiap.dao.RecorrenciaDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.singleton.ConnectionManager;

public class OracleRecorrenciaDAO implements RecorrenciaDAO {

	private Connection conexao;

	@Override
	public void create(Recorrencia recorrencia) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "INSERT INTO t_fth_recorrencia (id_recorrencia, dt_inicio, dt_fim, vr_recorrencia, dt_alteracao, status) VALUES (SQ_FTH_RECORRENCIA_IDRECORRENCIA.NEXTVAL,?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);
			
			stmt.setDate(1, recorrencia.getDtInicio());
			stmt.setDate(2, recorrencia.getDtFim());
			stmt.setDouble(3, recorrencia.getVrRecorrencia());
			Calendar dtInclusao = Calendar.getInstance();
			java.sql.Date dtInclusaoSql = new java.sql.Date(dtInclusao.getTimeInMillis());
			stmt.setDate(4, dtInclusaoSql);
			stmt.setInt(5, recorrencia.isStatus());
			
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Erro ao cadastrar recorrencia");
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
	public void update(Recorrencia recorrencia) throws DBException {

	}

	@Override
	public void delete(int recorrencia) throws DBException {

	}

	@Override
	public Recorrencia read(int id) {

		return null;
	}

	@Override
	public List<Recorrencia> readAll() {

		return null;
	}
}
