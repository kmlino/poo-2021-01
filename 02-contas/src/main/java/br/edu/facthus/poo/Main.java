package br.edu.facthus.poo;

import java.util.Scanner;

public class Main {
	
	public static void exemplo01() {
		Conta conta = new Conta(123, 987, "Fernando");
		System.out.println("Conta criada! Saldo: " + conta.getSaldo());
		
		conta.deposito(1000);
		System.out.println("Depósito realizado! Saldo: " + conta.getSaldo());
		
		conta.saque(200);
		System.out.println("Saque realizado! Saldo: " + conta.getSaldo());
	}
	
	public static void exemplo02() {
		// Instancia o scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um inteiro:");
		
		// Leitura do valor digitado
		Integer n = scanner.nextInt();
		
		System.out.println("Você digitou: " + n);
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		// exemplo01();
		exemplo02();
	}

}
