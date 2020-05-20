package aula13;

public class Aula13 {

	public static void main(String[] args) {
		Mamifero x = new Mamifero();
		Lobo y = new Lobo();
		Cachorro z = new Cachorro();
		
		x.emitirSom();
		y.emitirSom();
		z.emitirSom();
		
		z.reagir("Olá");
		z.reagir("Vai apanhar!");
		z.reagir(11,45);
		z.reagir(21,00);
		z.reagir(true);
		z.reagir(false);
		z.reagir(2,12.5);
		z.reagir(17,4.5);
		
		
	}

}
