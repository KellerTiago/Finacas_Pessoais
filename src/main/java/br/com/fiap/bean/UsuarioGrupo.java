package br.com.fiap.bean;

import java.sql.Date;

public class UsuarioGrupo {
	
	private int idGrupo;
	private String nmGrupo;
	private Date dtInclusao;
	private Date dtAlteracao;
	private boolean status;

	
	public UsuarioGrupo() {
	}
	
	public UsuarioGrupo(int idGrupo, String nmGrupo, Date dtInclusao, Date dtAlteracao, boolean status) {
		super();
		this.idGrupo = idGrupo;
		this.nmGrupo = nmGrupo;
		this.dtInclusao = dtInclusao;
		this.dtAlteracao = dtAlteracao;
		this.status = status;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNmGrupo() {
		return nmGrupo;
	}

	public void setNmGrupo(String nmGrupo) {
		this.nmGrupo = nmGrupo;
	}

	public Date getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public Date getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}



}
