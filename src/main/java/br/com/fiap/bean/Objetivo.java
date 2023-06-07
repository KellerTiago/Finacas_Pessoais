package br.com.fiap.bean;

import java.sql.Date;

public class Objetivo {

	private int idObjetivo;
	private UsuarioGrupo grupo = new UsuarioGrupo();
	private String dsObjetivo;
	private double vrObjetivo;
	private Date dtInicio;
	private Date dtFim;
	private Date dtInclusao;
	private boolean status;

	public Objetivo() {
	}

	public Objetivo(int idObjetivo, UsuarioGrupo grupo, String dsObjetivo, double vrObjetivo, Date dtInicio, Date dtFim,
			Date dtInclusao, boolean status) {
		super();
		this.idObjetivo = idObjetivo;
		this.grupo = grupo;
		this.dsObjetivo = dsObjetivo;
		this.vrObjetivo = vrObjetivo;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.dtInclusao = dtInclusao;
		this.status = status;
	}

	public int getIdObjetivo() {
		return idObjetivo;
	}

	public void setIdObjetivo(int idObjetivo) {
		this.idObjetivo = idObjetivo;
	}

	public UsuarioGrupo getGrupo() {
		return grupo;
	}

	public void setGrupo(UsuarioGrupo grupo) {
		this.grupo = grupo;
	}

	public String getDsObjetivo() {
		return dsObjetivo;
	}

	public void setDsObjetivo(String dsObjetivo) {
		this.dsObjetivo = dsObjetivo;
	}

	public double getVrObjetivo() {
		return vrObjetivo;
	}

	public void setVrObjetivo(double vrObjetivo) {
		this.vrObjetivo = vrObjetivo;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtFim() {
		return dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
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
