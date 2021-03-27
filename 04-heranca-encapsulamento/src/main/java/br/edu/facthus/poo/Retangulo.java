package br.edu.facthus.poo;

public class Retangulo {
	
	protected int base;
	
	protected int altura;
	
	public Retangulo(int base, int altura) {
		super();
		if (base < 0 || altura < 0) {
			System.out.println("Erro: valores inválidos!");
			return;
		}
		this.base = base;
		this.altura = altura;
	}
	
	public void imprime() {
		System.out.printf("Base: %d - Altura: %d\n",
				base, altura);
	}
	
	public void imprimePerimetro() {
		System.out.printf("Perímetro = %d\n", 2 * base + 2 * altura);
	}
	
	public void imprimeArea() {
		System.out.printf("Área = %d\n", base * altura);
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		if (base < 0) {
			System.out.println("Valor inválido!");
			return;
		}
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		if (altura < 0) {
			System.out.println("Valor inválido!");
			return;
		}
		this.altura = altura;
	}
	
}
