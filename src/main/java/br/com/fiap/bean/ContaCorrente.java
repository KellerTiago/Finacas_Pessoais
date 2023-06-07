package br.com.fiap.bean;

public class ContaCorrente extends ContaBancaria {
	
	private double vrTarifa;
	private String nmTarifa;
	private double vrLimite;
	
	public ContaCorrente() {
		
	}

	public ContaCorrente(double vrTarifa, String nmTarifa, double vrLimite) {
		this.vrTarifa = vrTarifa;
		this.nmTarifa = nmTarifa;
		this.vrLimite = vrLimite;
	}

	public double getVrTarifa() {
		return vrTarifa;
	}

	public void setVrTarifa(double vrTarifa) {
		this.vrTarifa = vrTarifa;
	}

	public String getNmTarifa() {
		return nmTarifa;
	}

	public void setNmTarifa(String nmTarifa) {
		this.nmTarifa = nmTarifa;
	}

	public double getVrLimite() {
		return vrLimite;
	}

	public void setVrLimite(double vrLimite) {
		this.vrLimite = vrLimite;
	}
	
	
	
	
	


}
