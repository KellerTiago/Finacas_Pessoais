package br.com.fiap.bean;

import java.sql.Date;

public class Parcela {

	private int idParcela;
	private Lancamento lancamento = new Lancamento();
	private Date dtParcela;
	private int nrParcela;
	private double vrParcela;
	private Date dtInclusao;

	public Parcela() {}

	public Parcela(int idParcela, Lancamento lancamento, Date dtParcela, int nrParcela, double vrParcela,
			Date dtInclusao) {
		super();
		this.idParcela = idParcela;
		this.lancamento = lancamento;
		this.dtParcela = dtParcela;
		this.nrParcela = nrParcela;
		this.vrParcela = vrParcela;
		this.dtInclusao = dtInclusao;
	}

	public int getIdParcela() {
		return idParcela;
	}

	public void setIdParcela(int idParcela) {
		this.idParcela = idParcela;
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}

	public Date getDtParcela() {
		return dtParcela;
	}

	public void setDtParcela(Date dtParcela) {
		this.dtParcela = dtParcela;
	}

	public int getNrParcela() {
		return nrParcela;
	}

	public void setNrParcela(int nrParcela) {
		this.nrParcela = nrParcela;
	}

	public double getVrParcela() {
		return vrParcela;
	}

	public void setVrParcela(double vrParcela) {
		this.vrParcela = vrParcela;
	}

	public Date getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

}
