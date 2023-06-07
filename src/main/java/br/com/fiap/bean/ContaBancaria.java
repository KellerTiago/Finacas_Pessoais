package br.com.fiap.bean;

import java.sql.Date;

public abstract class ContaBancaria {

	protected int idConta;
	protected Instituicao Instituicao = new Instituicao();
	protected int nrAgencia;
	protected int nrConta;
	protected double saldoConta;
	protected Date dtAlteracao;
	protected boolean Status;

	public ContaBancaria(){

	}

	public ContaBancaria(int idConta, br.com.fiap.bean.Instituicao instituicao, int nrAgencia, int nrConta,
			double saldoConta, Date dtAlteracao, boolean status) {
		super();
		this.idConta = idConta;
		Instituicao = instituicao;
		this.nrAgencia = nrAgencia;
		this.nrConta = nrConta;
		this.saldoConta = saldoConta;
		this.dtAlteracao = dtAlteracao;
		Status = status;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public Instituicao getInstituicao() {
		return Instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		Instituicao = instituicao;
	}

	public int getNrAgencia() {
		return nrAgencia;
	}

	public void setNrAgencia(int nrAgencia) {
		this.nrAgencia = nrAgencia;
	}

	public int getNrConta() {
		return nrConta;
	}

	public void setNrConta(int nrConta) {
		this.nrConta = nrConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public Date getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}


}
