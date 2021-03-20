package br.edu.facthus.poo;

public class Person {
	
	private String name;
	
	private int age;
	
	private String code;
	
	private int credits;
	
	public Person(String myName, int myAge) {
		this.name = myName;
		this.age = myAge;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public int getCredits() {
		return credits;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

}
