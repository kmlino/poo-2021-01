package br.edu.facthus.polimorfismo.exercicio;

import java.math.BigDecimal;

public class Vendedor extends Funcionario {
	
	private int horasTrabalhadas;
	
	private BigDecimal valorHora;
		
	@Override
	public void imprimeSalario() {
		System.out.printf("Vendedor: %s\n\tSalário: R$ %.2f\n",
				nome, 
				salario
					.add(
						valorHora.multiply(
								new BigDecimal(horasTrabalhadas)))
					.floatValue());
	}
	
	public Vendedor(String nome, 
			BigDecimal salario,
			BigDecimal valorHora) {
		super(nome, salario);
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public BigDecimal getValorHora() {
		return valorHora;
	}

	public void setValorHora(BigDecimal valorHora) {
		this.valorHora = valorHora;
	}

}
