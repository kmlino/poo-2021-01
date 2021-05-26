package br.edu.facthus;

public class Produto {
	
	private Integer id;
	
	private String descricao;
	
	private Boolean ativo;
	
	public void imprime() {
		System.out.printf("\n\nProduto: %d\n"
				+ "%s\n"
				+ "Ativo: %s", id, descricao, ativo ? "SIM" : "NÃO");
	}
	
	public Produto(Integer id, String descricao, Boolean ativo) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.ativo = ativo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
