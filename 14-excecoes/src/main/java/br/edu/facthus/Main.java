package br.edu.facthus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void ex01() {
		FileWriter fileWriter = null;
		BufferedWriter bWriter = null;
		
		try {
			fileWriter = new FileWriter("teste.txt");
			bWriter = new BufferedWriter(fileWriter);
			
			bWriter.write("abc\n");
			bWriter.write("def\n");
			bWriter.write("ghi\n");
			
			System.out.println("Ok!");
		} catch (IOException e) {
			System.out.println("Erro abrindo arquivo.");
		} finally {
			try {
				bWriter.close();
			} catch (IOException e) {
				// Ok, o writer está fechado
			}
		}
	}
	
	public static void ex02() {
		FileReader fileReader = null;
		BufferedReader bReader = null;
		
		try {
			fileReader = new FileReader("teste.txt");
			bReader = new BufferedReader(fileReader);
			
			while (bReader.ready())
				System.out.println(bReader.readLine());
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch (IOException e) {
			System.out.println("Erro lendo arquivo.");
		} finally {
			try {
				bReader.close();
			} catch (IOException e) {
				// OK
			}
		}
	}
	
	public static void ex03() {
		try {
			System.out.println("Testando exceções...");
			// throw new RuntimeException("Exceção de teste");
			System.out.println("Ok!");
			return;
		} catch (RuntimeException e) {
			System.out.println("RuntimeException atingida!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Mensagem impressa no finally");
		}
	}
	
	public static void main(String[] args) {
		// ex01();
		// ex02();
		ex03();
	}

}
