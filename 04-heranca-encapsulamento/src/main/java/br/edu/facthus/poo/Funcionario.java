package br.edu.facthus.poo;

import java.time.LocalDate;

public class Funcionario {
	
	private String nome;
	
	private Integer salario;
	
	private LocalDate admissao;
	
	public Funcionario(String nome, Integer salario,
			LocalDate admissao) {
		this.nome = nome;
		this.salario = salario;
		this.admissao = admissao;
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
