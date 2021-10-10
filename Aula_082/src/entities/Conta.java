package entities;

public class Conta {
	
	private int numero;
	private String nome;
	private float saldo;

	public Conta(Integer numero, String nome, Float deposito) {
		// TODO Auto-generated constructor stub
		this.numero = numero;
		this.nome = nome;
		this.saldo = deposito;
	}
	
	public Conta(int numero, String nome) {
		// TODO Auto-generated constructor stub
		this.numero = numero;
		this.nome = nome;
		this.saldo = (float) 0;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void depositar(float valor) {
		this.saldo += valor;
	}
	
	public void sacar(float valor) {
		this.saldo -= valor + 5;
	}
	
	public String toString() {
		return "Updated account data:\n"
				+ "Account " +  numero
				+ ", Holder: " + nome
				+ ", Balance: $ " + saldo;
	}


}
