package br.edu.facthus.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Contato {
	
	private IntegerProperty id = new SimpleIntegerProperty();
	
	private StringProperty nome = new SimpleStringProperty();
	
	private StringProperty email = new SimpleStringProperty();

	public Contato() {
		
	}
	
	public Contato(Integer id, String nome, String email) {
		this.id = new SimpleIntegerProperty(id);
		this.nome = new SimpleStringProperty(nome);
		this.email = new SimpleStringProperty(email);
	}

	public StringProperty getNomeProperty() {
		return nome;
	}
	
	public StringProperty getEmailProperty() {
		return email;
	}

	public Integer getId() {
		return id.get();
	}

	public void setId(Integer id) {
		this.id.set(id);
	}

	public String getNome() {
		return nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}

	public String getEmail() {
		return email.get();
	}

	public void setEmail(String email) {
		this.email.set(email);
	}

}
