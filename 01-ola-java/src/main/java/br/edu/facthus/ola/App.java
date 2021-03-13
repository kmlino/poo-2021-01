package br.edu.facthus.ola;

public class App {

	public static void exemplo01() {
		int x = 10;
		String s = new String("abc");

		System.out.println("x = " + x);
		System.out.println("s = " + s);
	}

	public static void exemplo02() {
		String minhaString = new String("abcde");
		int n = minhaString.length();
		
		System.out.printf("A string %s possui %d caracteres.\n",
				minhaString,
				n);
	}
	
	public static void exemplo03() {
		int n = 10;
		String s = "abc";
		double d = 3.141516;
		
		System.out.printf("n = %d\ns = %s\nd = %.2f\n",
				n, s, d);
		
	}
	
	public static void exemplo04() {
		String original = new String("abcde");
		String nova = original.replace('c', 'x');
		
		System.out.printf("Original: %s\nNova: %s", original, nova);
	}
	
	public static void exemplo05() {
		// Wrappers permitem conversão de tipos
		String s = new String("5");
		int n = Integer.parseInt(s);
		System.out.printf("s = %s\nn = %d\n", s, n);
		
		// Wrappers podem assumir valores nulos
		Integer n1 = null;
		System.out.println(n1);
	}	
	
	public static void exemplo06() {
		// Instancia o objeto aluno
		Aluno aluno = new Aluno(123456, "Aluno Um");
		aluno.imprime();
		
		// Instancia e configura o outro aluno
		Aluno aluno2 = new Aluno(987654, "Aluno Dois");
		aluno2.imprime();
		
		// Instancia e configura o outro aluno
		Aluno aluno3 = new Aluno(111111, "Aluno Três");
		aluno3.imprime();
	}

	
	public static void main(String[] args) {
		// exemplo01();
		// exemplo02();
		// exemplo03();
		// exemplo04();
		// exemplo05();
		exemplo06();
	}

}
