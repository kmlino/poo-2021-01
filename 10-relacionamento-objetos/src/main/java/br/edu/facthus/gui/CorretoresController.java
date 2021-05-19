package br.edu.facthus.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import br.edu.facthus.db.DbTeste;
import br.edu.facthus.model.Corretor;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class CorretoresController implements Initializable {
	
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
	private TableView<Corretor> tblCorretores;
	
	@FXML
	private TableColumn<Corretor, String> colNome;
	
	@FXML
	private TableColumn<Corretor, String> colCpf;
	
	@FXML
	private TableColumn<Corretor, String> colTelefone;
	
	@FXML
	private TableColumn<Corretor, String> colCresci;
	
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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		colNome.setCellValueFactory(
				new PropertyValueFactory<Corretor, String>("nome"));
		colTelefone.setCellValueFactory(
				new PropertyValueFactory<Corretor, String>("telefone"));
		colCpf.setCellValueFactory(
				new PropertyValueFactory<Corretor, String>("cpf"));
		colCresci.setCellValueFactory(
				new PropertyValueFactory<Corretor, String>("cresci"));
		
		ArrayList<Corretor> corretores = new ArrayList<>();
		corretores.add(new Corretor("Fulano de Tal", "123", "1234", "111", .05));
		corretores.add(new Corretor("Beltrano de Tal", "222", "333", "444", .05));
		corretores.add(new Corretor("Cicrano de Tal", "555", "666", "777", .05));
		
		tblCorretores.setItems(
				FXCollections.observableArrayList(corretores));
	}
	
}
