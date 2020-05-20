package aula05;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public ContaBanco(int numConta, String dono) {
		this.numConta = numConta;
		this.dono = dono;
		this.saldo = 0;
		this.status = false;
	}

	public void Status() {
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
		
		}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);

		if (t == "cc") {
			this.setSaldo(50.00);
		} else {
			this.setSaldo(150.00);
		}
		System.out.println("Conta aberta com sucesso!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Essa conta tem saldo");
		} else if (this.getSaldo() < 0) {
			System.out.println("Essa conta tem débitos pendentes");
		} else {
			setStatus(false);
		}
		System.out.println("Conta fechada com sucesso!");
	}

	public void depositar(double d) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + d);
			System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta fechada");
		}
	}

	public void sacar(double s) {
		if (this.getStatus() == true && this.getSaldo() >= s) {
			this.setSaldo(this.getSaldo() - s);
			System.out.println("Saque realizada na conta de " + this.getDono());
		} else if (this.getStatus() == true && this.getSaldo() < s) {
			System.out.println("A conta não possui saldo suficiente!");
		} else if (this.getStatus() != true) {
			System.out.println("A conta não está ativa!");
		}
	}

	public void pagarMensal() {
		int mensalidadecc = 12;
		int mensalidadecp = 20;

		if (this.getTipo() == "cc" && this.getStatus() == true && this.getSaldo() >= mensalidadecc) {
			this.setSaldo(this.getSaldo() - mensalidadecc);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else if (this.getTipo() == "cp" && this.getStatus() == true && this.getSaldo() < mensalidadecc) {
			System.out.println("A conta não possui saldo suficiente!");
		} else if (this.getStatus() != true) {
			System.out.println("A conta não está ativa!");
		} else if (this.getTipo() == "cp" && this.getStatus() != true && this.getSaldo() >= mensalidadecp) {
			setSaldo(this.getSaldo() - mensalidadecp);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else if (this.getTipo() == "cp" && this.getStatus() != true && this.getSaldo() < mensalidadecp) {
			System.out.println("A conta não possui saldo suficiente!");
		}
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
