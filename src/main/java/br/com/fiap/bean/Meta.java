package br.com.fiap.bean;

import java.sql.Date;

public class Meta {

	private int idMeta;
	private int idObjetivo = new Objetivo().getIdObjetivo();
	private int idCategoria = new CategoriaLancamento().getIdCategoria();
	private int idRecorrencia = new Recorrencia().getIdRecorrencia();
	private String dsMeta;
	private Double vrMeta;
	private Date dtInclusao;
	private boolean status;

	public Meta() {
	}

	public Meta(int idMeta, int idObjetivo, int idCategoria, int idRecorrencia, String dsMeta,
			Double vrMeta, Date dtInclusao, boolean status) {
		super();
		this.idMeta = idMeta;
		this.idObjetivo = idObjetivo;
		this.idCategoria = idCategoria;
		this.idRecorrencia = idRecorrencia;
		this.dsMeta = dsMeta;
		this.vrMeta = vrMeta;
		this.dtInclusao = dtInclusao;
		this.status = status;
	}

	public int getIdMeta() {
		return idMeta;
	}

	public void setIdMeta(int idMeta) {
		this.idMeta = idMeta;
	}

	
	
	public int getIdObjetivo() {
		return idObjetivo;
	}

	public void setIdObjetivo(int idObjetivo) {
		this.idObjetivo = idObjetivo;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public int getIdRecorrencia() {
		return idRecorrencia;
	}

	public void setIdRecorrencia(int idRecorrencia) {
		this.idRecorrencia = idRecorrencia;
	}

	public String getDsMeta() {
		return dsMeta;
	}

	public void setDsMeta(String dsMeta) {
		this.dsMeta = dsMeta;
	}

	public Double getVrMeta() {
		return vrMeta;
	}

	public void setVrMeta(Double vrMeta) {
		this.vrMeta = vrMeta;
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
