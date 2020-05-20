package aula02;

public class Caneta {
	public String modelo;
	private String cor;
	private double ponta;
	private boolean tampada;

	public Caneta() {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.tampada = tampada;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void status() {
		System.out.println("Modelo " + this.getModelo());
		System.out.println("Ponta " + this.getPonta());
		System.out.println("Cor " + this.cor);
		System.out.println("Está tampada? " + this.tampada);
	}
}
