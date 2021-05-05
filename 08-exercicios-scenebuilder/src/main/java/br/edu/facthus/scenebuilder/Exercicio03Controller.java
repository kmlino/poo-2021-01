package br.edu.facthus.scenebuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Exercicio03Controller {
	
	@FXML
	private TextField txtNumero1;
	
	@FXML
	private TextField txtNumero2;
	
	@FXML
	private TextField txtNumero3;
	
	@FXML
	private Label lblSoma;
	
	@FXML
	private Label lblMedia;
	
	@FXML
	private Label lblProduto;
	
	@FXML
	private void calcula() {
		Integer n1 = Integer.parseInt(txtNumero1.getText());
		Integer n2 = Integer.parseInt(txtNumero2.getText());
		Integer n3 = Integer.parseInt(txtNumero3.getText());
		
		lblSoma.setText(String.format("Soma = %d", 
				n1 + n2 + n3));
		lblMedia.setText(String.format("Média = %.2f", 
				(n1 + n2 + n3) / 3.0));
		lblProduto.setText(String.format("Produto = %d", 
				n1 * n2 * n3));
	}
	
}
