package br.edu.facthus.model;

public class Corretor extends Pessoa {
	
	private String cresci;
	
	private double corretagem;

	public Corretor(String nome, 
			String cpf, 
			String telefone, 
			String cresci, 
			double corretagem) {
		super(nome, cpf, telefone);
		this.cresci = cresci;
		this.corretagem = corretagem;
	}

	public String getCresci() {
		return cresci;
	}

	public void setCresci(String cresci) {
		this.cresci = cresci;
	}

	public double getCorretagem() {
		return corretagem;
	}

	public void setCorretagem(double corretagem) {
		this.corretagem = corretagem;
	}

}
