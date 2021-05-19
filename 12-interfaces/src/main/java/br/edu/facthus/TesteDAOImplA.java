package br.edu.facthus;

public class TesteDAOImplA implements TesteDAO {

	@Override
	public void insere(Teste teste) {
		System.out.println("Inserindo teste utilizando A...");
	}

	@Override
	public Teste busca(Integer ti) {
		System.out.println("Buscando teste utilizando A...");
		return null;
	}

	@Override
	public void atualiza(Teste teste) {
		System.out.println("Atualizando teste utilizando A...");
	}

	@Override
	public void remove(Teste teste) {
		System.out.println("Removendo teste utilizando A...");
	}

}
