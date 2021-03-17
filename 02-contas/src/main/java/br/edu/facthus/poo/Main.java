package br.edu.facthus.poo;

public class Main {

	public static void main(String[] args) {
		
		Conta conta = new Conta(123, 987, "Fernando");
		System.out.println("Conta criada! Saldo: " + conta.getSaldo());
		
		conta.deposito(1000);
		System.out.println("Depósito realizado! Saldo: " + conta.getSaldo());
		
		conta.saque(200);
		System.out.println("Saque realizado! Saldo: " + conta.getSaldo());
		
	}

}
