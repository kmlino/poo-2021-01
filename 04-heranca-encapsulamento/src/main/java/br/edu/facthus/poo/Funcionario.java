package br.edu.facthus.poo;

import java.time.LocalDate;

public class Funcionario {
	
	protected String nome;
	
	protected Integer salario;
	
	protected LocalDate admissao;
	
	public Funcionario(String nome, Integer salario,
			LocalDate admissao) {
		this.nome = nome;
		this.salario = salario;
		this.admissao = admissao;
	}
	
	public void imprime() {
		System.out.printf("Funcionário %s recebe R$ %d\n", 
				nome, salario);
	}
	
	public String getSalarioStr() {
		return String.format("Funcionário %s recebe R$ %d\n", 
				nome, salario);
	}
	
	public Integer getSalarioTotal() {
		return salario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public LocalDate getAdmissao() {
		return admissao;
	}

	public void setAdmissao(LocalDate admissao) {
		this.admissao = admissao;
	}

}
