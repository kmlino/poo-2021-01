package br.edu.facthus.model;

public class Imovel {
	
	private String registro;
	
	private double aluguel;
	
	private boolean alugado;
	
	private Pessoa proprietario;
	
	private Corretor corretor;

	public Imovel(String registro, 
			double aluguel, 
			Pessoa proprietario) {
		super();
		this.registro = registro;
		this.aluguel = aluguel;
		this.proprietario = proprietario;
		this.alugado = false;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public double getAluguel() {
		return aluguel;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

	public Corretor getCorretor() {
		return corretor;
	}

	public void setCorretor(Corretor corretor) {
		this.corretor = corretor;
	}

}
