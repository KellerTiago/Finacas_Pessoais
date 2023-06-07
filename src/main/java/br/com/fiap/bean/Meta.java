package br.com.fiap.bean;

import java.sql.Date;

public class Meta {

	private int idMeta;
	private Objetivo objetivo = new Objetivo();
	private CategoriaLancamento categoria = new CategoriaLancamento();
	private Recorrencia recorrencia = new Recorrencia();
	private String dsMeta;
	private Double vrMeta;
	private Date dtInclusao;
	private boolean status;

	public Meta() {
	}

	public Meta(int idMeta, Objetivo objetivo, CategoriaLancamento categoria, Recorrencia recorrencia, String dsMeta,
			Double vrMeta, Date dtInclusao, boolean status) {
		super();
		this.idMeta = idMeta;
		this.objetivo = objetivo;
		this.categoria = categoria;
		this.recorrencia = recorrencia;
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

	public Objetivo getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

	public CategoriaLancamento getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaLancamento categoria) {
		this.categoria = categoria;
	}

	public Recorrencia getRecorrencia() {
		return recorrencia;
	}

	public void setRecorrencia(Recorrencia recorrencia) {
		this.recorrencia = recorrencia;
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
