package br.edu.facthus;

public class TesteDAOImplB implements TesteDAO {

	@Override
	public void insere(Teste teste) {
		System.out.println("Inserindo teste utilizando B...");
	}

	@Override
	public Teste busca(Integer ti) {
		System.out.println("Buscando teste utilizando B...");
		return null;
	}

	@Override
	public void atualiza(Teste teste) {
		System.out.println("Atualizando teste utilizando B...");
	}

	@Override
	public void remove(Teste teste) {
		System.out.println("Removendo teste utilizando B...");
	}

}
