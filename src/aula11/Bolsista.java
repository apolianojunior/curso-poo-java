package aula11;

public class Bolsista extends Aluno {
	private int bolsa;
	
	
	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

	public void RenovarBolsa() {
		System.out.println("Renovando bolsa de "+this.nome);
		
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + "é bolsista! Pagamento facilitado!");
	}

}
