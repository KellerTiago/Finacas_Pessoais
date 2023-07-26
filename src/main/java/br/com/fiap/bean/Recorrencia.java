package br.com.fiap.bean;

import java.sql.Date;
import java.util.Calendar;

public class Recorrencia {

	private int idRecorrencia;
	private Date dtInicio;
	private Date dtFim;
	private double vrRecorrencia;
	private Calendar dtAltercao;
	private int status;

	public Recorrencia() {
	}



	public Recorrencia(int idRecorrencia, Date dtInicio, Date dtFim, double vrRecorrencia, Calendar dtAltercao,
			int status) {
		super();
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

	public Calendar getDtAltercao() {
		return dtAltercao;
	}

	public void setDtAltercao(Calendar dtAltercao) {
		this.dtAltercao = dtAltercao;
	}

	public int isStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
