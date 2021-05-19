package br.edu.facthus.polimorfismo.exercicio;

import java.math.BigDecimal;

public class Gerente extends Funcionario {
	
	private BigDecimal gratificacao;

	@Override
	public void imprimeSalario() {
		System.out.printf("Gerente: %s\n\tSalário: R$ %.2f\n",
				nome, salario.add(gratificacao).floatValue());
	}
	
	public Gerente(String nome, 
			BigDecimal salario,
			BigDecimal gratificacao) {
		super(nome, salario);
		this.gratificacao = gratificacao;
	}

	public BigDecimal getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(BigDecimal gratificacao) {
		this.gratificacao = gratificacao;
	}

}
