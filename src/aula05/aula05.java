package aula05;

public class aula05 {
	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco(1111, "Jubileu");
		ContaBanco p2 = new ContaBanco(2222, "Creuza");

		p1.abrirConta("cc");
		p2.abrirConta("cp");

		p1.depositar(100);
		p2.depositar(500);
		
		p2.sacar(100);
		
		p1.sacar(150);
		p1.fecharConta();

		p1.Status();
		p2.Status();

	}
}
