package br.edu.facthus.gui;

import br.edu.facthus.db.DbTeste;
import br.edu.facthus.model.Corretor;
import br.edu.facthus.model.Pessoa;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CorretoresController {
	
	@FXML
	private TextField txtNome;
	
	@FXML
	private TextField txtCpf;

	@FXML
	private TextField txtTelefone;
	
	@FXML
	private TextField txtCresci;
	
	@FXML
	private TextField txtCorretagem;
	
	@FXML
	private Label statusLabel;
	
	@FXML
	private void cadastra() {
		Corretor corretor = new Corretor(txtNome.getText(),
				txtCpf.getText(),
				txtTelefone.getText(),
				txtCresci.getText(),
				Double.parseDouble(txtCorretagem.getText()));
		
		DbTeste.acrescentaCorretor(corretor);
		DbTeste.imprimeCorretores();
		
		statusLabel.setText("Corretor cadastrado com sucesso!");
	}
	
}
