package br.edu.facthus.poo;

public class Main {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Fernando", 30);
		Module m1 = new Module("POO");
		
		System.out.println("O nome de p1 é " + p1.getName());
		System.out.println("O código de m1 é " + m1.getCode());

	}

}
