package br.edu.facthus.poo;

public class Conta {
	
	private Integer agencia;
	
	private Integer conta;
	
	private String titular;
	
	private Integer saldo;
	
	public Conta(Integer agencia, Integer conta, String titular) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		
		// Saldo inicial igual a 0
		this.saldo = 0;
		
		System.out.println("Conta criada com sucesso!");
		imprime();
	}
	
	public void deposito(Integer valor) {
		if (valor <= 0) {
			System.err.println("Valor inválido...");
			return;
		}
		
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso!");
		imprime();
	}
	
	public void saque(Integer valor) {
		if (valor <= 0) {
			System.err.println("Valor inválido...");
			return;
		}
		
		if (valor > saldo) {
			System.err.println("Saldo insuficiente...");
			return;
		}
		
		this.saldo -= valor;
		System.out.println("Saque realizado com sucesso!");
		imprime();
	}
	
	public void imprime() {
		System.out.printf("Agência: %d\n"
				+ "Conta: %d\n"
				+ "Titular: %s\n"
				+ "Saldo: %d\n\n", agencia, conta, titular, saldo);
	}
	
	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

}
