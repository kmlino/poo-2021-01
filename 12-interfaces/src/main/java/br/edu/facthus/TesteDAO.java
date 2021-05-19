package br.edu.facthus;

public interface TesteDAO {
	
	void insere(Teste teste);
	
	Teste busca(Integer ti);
	
	void atualiza(Teste teste);
	
	void remove(Teste teste);

}
