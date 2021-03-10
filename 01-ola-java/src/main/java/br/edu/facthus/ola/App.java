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

	public static void main(String[] args) {
		// exemplo01();
		// exemplo02();
		exemplo03();
	}

}
