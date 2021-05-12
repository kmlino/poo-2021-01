package br.edu.facthus.gui;

import br.edu.facthus.db.DbTeste;
import br.edu.facthus.model.Pessoa;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProprietariosController {
	
	@FXML
	private TextField txtNome;
	
	@FXML
	private TextField txtCpf;

	@FXML
	private TextField txtTelefone;
	
	@FXML
	private Label statusLabel;
	
	@FXML
	private void cadastra() {
		Pessoa pessoa = new Pessoa(txtNome.getText(),
				txtCpf.getText(),
				txtTelefone.getText());
		
		DbTeste.acrescentaProprietario(pessoa);
		DbTeste.imprimeProprietarios();
		
		statusLabel.setText("Proprietário cadastrado com sucesso!");
	}
	
}
