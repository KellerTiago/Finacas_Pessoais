package br.com.fiap.bean;

import java.sql.Date;

public class TipoLancamento {

	private int idTipoLanc;
	private String dsTipoLanc;
	private char tpDebCred;
	private Date dtInclusao;
	private boolean status;

	public TipoLancamento() {
	}

	public TipoLancamento(int idTipoLanc, String dsTipoLanc, char tpDebCred, Date dtInclusao, boolean status) {
		super();
		this.idTipoLanc = idTipoLanc;
		this.dsTipoLanc = dsTipoLanc;
		this.tpDebCred = tpDebCred;
		this.dtInclusao = dtInclusao;
		this.status = status;
	}

	public int getIdTipoLanc() {
		return idTipoLanc;
	}

	public void setIdTipoLanc(int idTipoLanc) {
		this.idTipoLanc = idTipoLanc;
	}

	public String getDsTipoLanc() {
		return dsTipoLanc;
	}

	public void setDsTipoLanc(String dsTipoLanc) {
		this.dsTipoLanc = dsTipoLanc;
	}

	public char getTpDebCred() {
		return tpDebCred;
	}

	public void setTpDebCred(char tpDebCred) {
		this.tpDebCred = tpDebCred;
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
