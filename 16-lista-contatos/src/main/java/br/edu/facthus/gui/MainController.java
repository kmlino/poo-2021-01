package br.edu.facthus.gui;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.facthus.model.Contato;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class MainController implements Initializable {
	
	@FXML
	private TextField txtNome;
	
	@FXML
	private TextField txtEmail;
	
	private Contato contato;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		contato = new Contato();
		
		txtNome.textProperty().bindBidirectional(contato.getNome());
		txtEmail.textProperty().bindBidirectional(contato.getEmail());
	}
	
	@FXML
	private void cadastra() {
		System.out.printf("Cadastrando contato: Nome - %s\n"
				+ "Email - %s\n", 
				contato.getNome().get(),
				contato.getEmail().get());
	}
	
}
