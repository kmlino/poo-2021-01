package br.edu.facthus.scenebuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Exercicio02Controller {
	
	@FXML
	private TextField txtNumero1;
	
	@FXML
	private TextField txtNumero2;
	
	@FXML
	private Label lblSaida;
	
	@FXML
	private void soma() {
		Integer n1 = Integer.parseInt(txtNumero1.getText());
		Integer n2 = Integer.parseInt(txtNumero2.getText());
		
		lblSaida.setText(String.format("%d + %d = %d", 
				n1, n2, n1 + n2));
	}
	
	@FXML
	private void subtracao() {
		Integer n1 = Integer.parseInt(txtNumero1.getText());
		Integer n2 = Integer.parseInt(txtNumero2.getText());
		
		lblSaida.setText(String.format("%d - %d = %d", 
				n1, n2, n1 - n2));
		
	}
	
}
