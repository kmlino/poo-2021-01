package br.edu.facthus.poo;

import java.util.Scanner;

public class Main {
	
	public static void exemplo01() {
		Conta conta = new Conta(123, 987, "Fernando");
		
		conta.deposito(1000);
		
		conta.saque(200);
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
	
	public static void imprimeMenu() {
		System.out.println("Digite:");
		System.out.println("[1] para criar uma nova conta.");
		System.out.println("[2] para consultar o saldo.");
		System.out.println("[3] para fazer um saque.");
		System.out.println("[4] para fazer um depósito.");
		System.out.println("[9] para sair.");
	}
	
	public static void main(String[] args) {
		imprimeMenu();
		
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Criar nova conta (em construção)...");
			break;
		case 2:
			System.out.println("Consultar o saldo (em construção)...");
			break;
		case 3:
			System.out.println("Fazer um saque (em construção)...");
			break;
		case 4:
			System.out.println("Fazer um depósito (em construção)...");
			break;
		case 9:
			System.out.println("Sair (em construção)...");
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
		scanner.close();
		
	}

}
