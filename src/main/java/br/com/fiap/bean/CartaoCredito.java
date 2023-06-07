package br.com.fiap.bean;

import java.sql.Date;

public class CartaoCredito {

	private int idCartao;
	private String dsBandeira;
	private double vrLimite;
	private int nrCartao;
	private Date dtExpiracao;
	private boolean status;
	private Instituicao instituicao = new Instituicao();


	public CartaoCredito () {

	}


	public CartaoCredito(int idCartao, String dsBandeira, double vrLimite, int nrCartao, Date dtExpiracao,
			boolean status, Instituicao instituicao) {
		super();
		this.idCartao = idCartao;
		this.dsBandeira = dsBandeira;
		this.vrLimite = vrLimite;
		this.nrCartao = nrCartao;
		this.dtExpiracao = dtExpiracao;
		this.status = status;
		this.instituicao = instituicao;
	}


	public int getIdCartao() {
		return idCartao;
	}


	public void setIdCartao(int idCartao) {
		this.idCartao = idCartao;
	}


	public String getDsBandeira() {
		return dsBandeira;
	}


	public void setDsBandeira(String dsBandeira) {
		this.dsBandeira = dsBandeira;
	}


	public double getVrLimite() {
		return vrLimite;
	}


	public void setVrLimite(double vrLimite) {
		this.vrLimite = vrLimite;
	}


	public int getNrCartao() {
		return nrCartao;
	}


	public void setNrCartao(int nrCartao) {
		this.nrCartao = nrCartao;
	}


	public Date getDtExpiracao() {
		return dtExpiracao;
	}


	public void setDtExpiracao(Date dtExpiracao) {
		this.dtExpiracao = dtExpiracao;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Instituicao getInstituicao() {
		return instituicao;
	}


	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}



}
