package br.com.fiap.bean;

public class Instituicao {
	
	private int idInstituicao ;
	private String nmInstituicaoFin;
	
	public Instituicao() {
	
	}

	public Instituicao(int idInstituicao, String nmInstituicaoFin) {
		super();
		this.idInstituicao = idInstituicao;
		this.nmInstituicaoFin = nmInstituicaoFin;
	}

	public int getIdInstituicao() {
		return idInstituicao;
	}

	public void setIdInstituicao(int idInstituicao) {
		this.idInstituicao = idInstituicao;
	}

	public String getNmInstituicaoFin() {
		return nmInstituicaoFin;
	}

	public void setNmInstituicaoFin(String nmInstituicaoFin) {
		this.nmInstituicaoFin = nmInstituicaoFin;
	}


}
