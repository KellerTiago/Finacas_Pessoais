package br.com.fiap.bean;

import java.sql.Date;

public class CategoriaLancamento {

	private int idCategoria;
	private String dsCategoria;
	private Date dtInclusao;
	private boolean status;


	public CategoriaLancamento () {

	}	

	public CategoriaLancamento(int idCategoria, String dsCategoria, Date dtInclusao, boolean status) {
		super();
		this.idCategoria = idCategoria;
		this.dsCategoria = dsCategoria;
		this.dtInclusao = dtInclusao;
		this.status = status;
	}


	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getDsCategoria() {
		return dsCategoria;
	}
	public void setDsCategoria(String dsCategoria) {
		this.dsCategoria = dsCategoria;
	}
	public Date getDtInclusao() {
		return dtInclusao;
	}
	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
