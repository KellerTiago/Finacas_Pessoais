package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.bean.Meta;
import br.com.fiap.dao.MetaDAO;
import br.com.fiap.exception.DBException;
import br.com.fiap.singleton.ConnectionManager;

public class OracleMetaDAO implements MetaDAO {
	
	private Connection conexao;

	@Override
	public void create(Meta meta) throws DBException {
		
	
		PreparedStatement stmt = null;
		
		try { 
		
		conexao = ConnectionManager.getInstance().getConnection();
		
		String sql = "INSERT INTO t_fth_meta (id_meta, id_objetivo, id_categoria, id_recorrencia, ds_meta, vr_meta, dt_inclusao, status) VALUES (SQ_FTH_META_IDMETA.NEXTVAL,?,?,?,?,?,?,?)";
		stmt = conexao.prepareStatement(sql);
		
		stmt.setInt(1, meta.getIdObjetivo());
		stmt.setInt(2, meta.getIdCategoria());
		stmt.setInt(3, meta.getIdRecorrencia());
		stmt.setString(4, meta.getDsMeta());
		stmt.setDouble(4, meta.getVrMeta());
		Calendar dtInclusao = Calendar.getInstance();
		Date dtInclusaoSQL = new Date(dtInclusao.getTimeInMillis());
		stmt.setDate(5, dtInclusaoSQL);
		stmt.setInt(6, meta.isStatus());
		
		stmt.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Erro ao tentar cadastrar a meta!");
			
		}finally {
			try {
				stmt.close();
				conexao.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void update(Meta meta) throws DBException {
		
		
	}

	@Override
	public void delete(int meta) throws DBException {
		
		
	}

	@Override
	public Meta read(int id_meta) throws DBException {
	
		return null;
	}

	@Override
	public List<Meta> readAll() throws DBException {
		
		List<Meta> lista = new ArrayList<Meta>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT id_meta, id_objetivo, id_categoria, id_recorrencia, ds_meta, vr_meta, dt_inclusao, status FROM t_fth_meta");
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				int idMeta = rs.getInt("id_meta");
				int idObjetivo = rs.getInt("id_objetivo");
				int idCategoria = rs.getInt("id_categoria");
				int idRecorrencia = rs.getInt("id_recorrencia");
				String dsMeta = rs.getString("ds_meta");
				double vrMeta = rs.getDouble("vr_meta");
				java.sql.Date data = rs.getDate("dt_inclusao");
				Calendar dtinclusao = Calendar.getInstance();
				dtinclusao.setTimeInMillis(data.getTime());
				int status = rs.getInt("status");
				
				Meta meta = new Meta(idMeta, idObjetivo, idCategoria, idRecorrencia, dsMeta, vrMeta, dtinclusao, status);
				lista.add(meta);
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
		
		return lista;
		
	}
	
	
	

}
