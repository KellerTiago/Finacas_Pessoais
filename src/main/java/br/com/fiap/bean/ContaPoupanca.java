package br.com.fiap.bean;

public class ContaPoupanca extends ContaBancaria {
	
	private double vrRendimento;
	
	public ContaPoupanca() {
	}

	public ContaPoupanca(double vrRendimento) {
		this.vrRendimento = vrRendimento;
	}

	public double getVrRendimento() {
		return vrRendimento;
	}

	public void setVrRendimento(double vrRendimento) {
		this.vrRendimento = vrRendimento;
	}
	
	
	

}
