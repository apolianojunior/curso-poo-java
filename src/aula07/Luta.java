package aula07;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private boolean aprovada;
	private int vencedor;

	public void marcarLuta(Lutador desafiado, Lutador desafiante) {
		if (desafiado != desafiante && desafiado.getCategoria() == desafiante.getCategoria()) {
			this.desafiado = desafiado;
			this.desafiante = desafiante;
			this.aprovada = true;
		} else {
			this.desafiado = null;
			this.desafiante = null;
			this.aprovada = false;
		}
	}

	public void lutar() {
		if (this.aprovada) {
			System.out.println("## DESAFIADO ##");
			this.desafiado.apresentar();
			System.out.println("## DESAFIANTE ##");
			this.desafiante.apresentar();

			Random aleatorio = new Random();
			this.vencedor = aleatorio.nextInt(3);
			System.out.println("## RESULTADO DA LUTA ##");

			switch (this.vencedor) {
			case 0: // Empate
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: // Desafiado vence
				System.out.println(this.desafiado.getNome() + " venceu!");
				this.desafiado.ganharLuta();
				break;
			case 2: // Desafiante vence
				System.out.println(this.desafiante.getNome()+ " venceu!");
				this.desafiante.ganharLuta();
				break;
			}

		} else {
			System.out.println("A luta não pode acontecer!");
		}

	}

	public int vencedor() {

		return vencedor;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

}
