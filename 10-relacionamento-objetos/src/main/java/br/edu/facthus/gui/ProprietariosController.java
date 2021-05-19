package br.edu.facthus.gui;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.facthus.db.DbTeste;
import br.edu.facthus.model.Pessoa;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProprietariosController implements Initializable {
	
	@FXML
	private TextField txtNome;
	
	@FXML
	private TextField txtCpf;

	@FXML
	private TextField txtTelefone;
	
	@FXML
	private Label statusLabel;
	
	@FXML
	private TableView<Pessoa> tblProprietarios;
	
	@FXML
	private TableColumn<Pessoa, String> colNome;
	
	@FXML
	private TableColumn<Pessoa, String> colCpf;
	
	@FXML
	private TableColumn<Pessoa, String> colTelefone;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Configura as factories
		colNome.setCellValueFactory(
				new PropertyValueFactory<Pessoa, String>("nome"));
		colCpf.setCellValueFactory(
				new PropertyValueFactory<Pessoa, String>("cpf"));
		colTelefone.setCellValueFactory(
				new PropertyValueFactory<Pessoa, String>("telefone"));
		
		// Cria proprietários de teste
		DbTeste.acrescentaProprietario(new Pessoa("João Silva", "123.456.789-10", "(34) 3322-2233"));
		DbTeste.acrescentaProprietario(new Pessoa("Maria Souza", "987.654.321-00", "(34) 3322-2222"));
		DbTeste.acrescentaProprietario(new Pessoa("José Silva", "111.222.333-44", "(34) 3322-3333"));
		
		// Vincula a lista à tabela
		tblProprietarios.setItems(
				FXCollections.observableArrayList(DbTeste.listaProprietarios()));
	}
	
	@FXML
	private void cadastra() {
		Pessoa pessoa = new Pessoa(txtNome.getText(),
				txtCpf.getText(),
				txtTelefone.getText());
		
		DbTeste.acrescentaProprietario(pessoa);
		
		// Atualiza a tabela
		tblProprietarios.setItems(
				FXCollections.observableArrayList(DbTeste.listaProprietarios()));
		
		statusLabel.setText("Proprietário cadastrado com sucesso!");
	}
	
}
