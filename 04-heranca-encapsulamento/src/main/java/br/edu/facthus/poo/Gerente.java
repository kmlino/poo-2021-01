package br.edu.facthus.poo;

import java.time.LocalDate;

public class Gerente extends Funcionario {
	
	public Gerente(String nome, 
			Integer salario, 
			LocalDate admissao,
			Integer gratificacao) {
		super(nome, salario, admissao);
		this.gratificacao = gratificacao;
	}
	
	public Integer getSalarioTotal() {
		return getSalario() + gratificacao;
	}

	private Integer gratificacao;

	public Integer getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(Integer gratificacao) {
		this.gratificacao = gratificacao;
	}

}
