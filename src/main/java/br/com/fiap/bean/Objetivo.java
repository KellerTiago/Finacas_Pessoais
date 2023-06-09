package br.com.fiap.bean;

import java.sql.Date;
import java.util.Calendar;

public class Objetivo {

	private int idObjetivo;
	private int idGrupo = new UsuarioGrupo().getIdGrupo();
	private String dsObjetivo;
	private double vrObjetivo;
	private Date dtInicio;
	private Date dtFim;
	private Calendar dtInclusao;
	private int status;

	public Objetivo() {
	}

	public Objetivo(int idObjetivo, int grupo, String dsObjetivo, double vrObjetivo, Date dtInicio, Date dtFim,
			Calendar dtInclusao, int status) {
		super();
		this.idObjetivo = idObjetivo;
		this.idGrupo = grupo;
		this.dsObjetivo = dsObjetivo;
		this.vrObjetivo = vrObjetivo;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.dtInclusao = dtInclusao;
		this.status = status;
	}

	
	
	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int grupo) {
		this.idGrupo = grupo;
	}

	public int getIdObjetivo() {
		return idObjetivo;
	}

	public void setIdObjetivo(int idObjetivo) {
		this.idObjetivo = idObjetivo;
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

	public Calendar getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(Calendar dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public int isStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}



}
