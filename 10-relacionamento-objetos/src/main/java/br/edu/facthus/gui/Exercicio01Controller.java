package br.edu.facthus.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Exercicio01Controller {
	
	@FXML
	private TextField txtEntrada;
	
	@FXML
	private Label lblSaida;
	
	@FXML
	private void dobro() {
		Integer numero = Integer.parseInt(txtEntrada.getText());
		lblSaida.setText(String.format("O dobro de %d é %d",
				numero, 2 * numero));
	}
	
}
