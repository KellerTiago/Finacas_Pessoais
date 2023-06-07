package br.com.fiap.bean;

import java.sql.Date;

public class Recorrencia {

	private int idRecorrencia;
	private Date dtInicio;
	private Date dtFim;
	private double vrRecorrencia;
	private Date dtAltercao;
	private boolean status;

	public Recorrencia() {
	}

	public Recorrencia(int idRecorrencia, Date dtInicio, Date dtFim, double vrRecorrencia, Date dtAltercao,
			boolean status) {
		this.idRecorrencia = idRecorrencia;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.vrRecorrencia = vrRecorrencia;
		this.dtAltercao = dtAltercao;
		this.status = status;
	}

	public int getIdRecorrencia() {
		return idRecorrencia;
	}

	public void setIdRecorrencia(int idRecorrencia) {
		this.idRecorrencia = idRecorrencia;
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

	public double getVrRecorrencia() {
		return vrRecorrencia;
	}

	public void setVrRecorrencia(double vrRecorrencia) {
		this.vrRecorrencia = vrRecorrencia;
	}

	public Date getDtAltercao() {
		return dtAltercao;
	}

	public void setDtAltercao(Date dtAltercao) {
		this.dtAltercao = dtAltercao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
