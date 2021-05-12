package br.edu.facthus.polimorfismo.exercicio;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Funcionario {
	
	protected String nome;
	
	protected BigDecimal salario;
	
	protected LocalDate admissao;
	
	public abstract void imprimeSalario();
	
	public Funcionario(String nome, BigDecimal salario) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.admissao = LocalDate.now();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getAdmissao() {
		return admissao;
	}

	public void setAdmissao(LocalDate admissao) {
		this.admissao = admissao;
	}

}
