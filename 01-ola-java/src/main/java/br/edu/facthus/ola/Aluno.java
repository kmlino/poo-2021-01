package br.edu.facthus.ola;

public class Aluno {
	
	private Integer matricula;
	
	private String nome;
	
	public Aluno(Integer matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public void imprime() {
		System.out.printf("-----\nMatrícula: %d\nNome: %s\n",
				matricula,
				nome);
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
