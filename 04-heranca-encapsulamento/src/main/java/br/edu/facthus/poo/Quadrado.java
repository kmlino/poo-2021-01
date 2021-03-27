package br.edu.facthus.poo;

public class Quadrado extends Retangulo {

	public Quadrado(int lado) {
		super(lado, lado);
	}
	
	@Override
	public void imprime() {
		System.out.printf("Lado: %d\n", base);
	}

}
