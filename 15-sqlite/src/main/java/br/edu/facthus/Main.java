package br.edu.facthus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	public static void criaBD() {
		try {
			Connection connection = DriverManager
					.getConnection("jdbc:sqlite:teste.db");
			Statement statement = connection.createStatement();
			
			statement.executeUpdate(
					"CREATE TABLE IF NOT EXISTS contatos ("
					+ "id INTEGER,"
					+ "nome TEXT,"
					+ "email TEXT,"
					+ "PRIMARY KEY (id))");
			
			System.out.println("Banco criado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro de SQL");
			e.printStackTrace();
		}
	}
	
	public static void insereContatos() {
		try {
			Connection connection = DriverManager
					.getConnection("jdbc:sqlite:teste.db");
			Statement statement = connection.createStatement();
			
			statement.executeUpdate(
					"INSERT INTO contatos (nome, email) "
					+ "VALUES ('abc', 'abc@mail.com')");
			statement.executeUpdate(
					"INSERT INTO contatos (nome, email) "
					+ "VALUES ('def', 'def@mail.com')");
			statement.executeUpdate(
					"INSERT INTO contatos (nome, email) VALUES "
					+ "('ghi', 'ghi@mail.com')");
			
			System.out.println("Contatos cadastrados com sucesso!");
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro de SQL");
			e.printStackTrace();
		}
	}
	
	public static void pesquisaContatos() {
		try {
			Connection connection = DriverManager
					.getConnection("jdbc:sqlite:teste.db");
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery(
					"SELECT id, nome, email FROM contatos");
			while (rs.next()) {
				System.out.printf("Id: %d | Nome: %s | Email: %s\n",
						rs.getInt("id"),
						rs.getString("nome"),
						rs.getString("email"));
			}
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro de SQL");
			e.printStackTrace();
		}		
	}
	
			
	public static void main(String[] args) {
		criaBD();
		insereContatos();
		pesquisaContatos();
	}

}
