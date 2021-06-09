package br.edu.facthus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.facthus.exception.CustomException;
import br.edu.facthus.model.Contato;

public class ContatosDAO {
	
	private Connection connection = null;
	
	private Connection getConnection() {
		try {
			if (connection == null)
				connection = DriverManager
					.getConnection("jdbc:sqlite:contatos.db");
			
			return connection;
		} catch (SQLException e) {
			throw new CustomException("Erro abrindo conexão com o banco de dados.");
		}
	}
	
	
	public void criaBD() {
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			
			statement.executeUpdate(
					"CREATE TABLE IF NOT EXISTS contatos ("
					+ "id INTEGER,"
					+ "nome TEXT,"
					+ "email TEXT,"
					+ "PRIMARY KEY (id))");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CustomException("Ocorreu um erro ao criar o banco de dados.");
		}
	}
	
	public void insereContato(Contato contato) {
		try {
			Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"INSERT INTO contatos (nome, email) "
					+ "VALUES (?, ?)");
			
			statement.setString(1, contato.getNome());
			statement.setString(2, contato.getEmail());
			
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CustomException("Ocorreu um erro ao inserir o contato.");
		}
	}
	
	public List<Contato> pesquisaContatos() {
		List<Contato> contatos = new ArrayList<>();
		
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery(
					"SELECT id, nome, email FROM contatos ORDER BY nome");
			
			while (rs.next()) {
				Contato contato = new Contato();
				contato.setId(rs.getInt("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				
				contatos.add(contato);
			}
			
			return contatos; 
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CustomException("Ocorreu um erro ao pesquisar os contatos.");
		}		
	}
		
	public void atualiza(Contato contato) {
		try {
			Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"UPDATE contatos SET nome = ?, email = ? WHERE id = ?");
			
			statement.setString(1, contato.getNome());
			statement.setString(2, contato.getEmail());
			statement.setInt(3, contato.getId());
			
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CustomException("Ocorreu um erro ao atualizar o contato.");
		}
	}
	
	public void remove(Contato contato) {
		try {
			Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"DELETE FROM contatos WHERE id = ?");
			
			statement.setInt(1, contato.getId());
			
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CustomException("Ocorreu um erro ao remover o contato.");
		}
	}
	
}
