package br.edu.facthus.polimorfismo;

import java.util.ArrayList;

public class Main {
	
	public static void ex01() {
		B b1 = new B();
		b1.m();
		
		C c1 = new C();
		c1.m();
		
		A x = new B();
		x.m();
		
		A y = new C();
		y.m();
	}
	
	public static void ex02() {
		ArrayList<A> lista = new ArrayList<>();
		
		lista.add(new B());
		lista.add(new B());
		lista.add(new C());
		lista.add(new C());
		lista.add(new C());
		
		for (A a : lista)
			a.m();
	}

	public static void main(String[] args) {
		// ex01();
		ex02();

	}

}
