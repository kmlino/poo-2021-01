package br.edu.facthus.scenebuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField txtEntrada;
	
	@FXML
	private Label lblSaida;
	
	@FXML
	private void teste() {
		lblSaida.setText("Olá " + txtEntrada.getText() 
		 + "! Seja bem vindo!");
	}
	
}
