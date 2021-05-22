package br.edu.facthus.gui;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.facthus.db.DbTeste;
import br.edu.facthus.model.Corretor;
import br.edu.facthus.model.Imovel;
import br.edu.facthus.model.Pessoa;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ImoveisController implements Initializable {
	
	@FXML
	private TextField txtRegistro;
	
	@FXML
	private TextField txtAluguel;
	
	@FXML
	private Label statusLabel;
	
	@FXML
	private TableView<Imovel> tblImoveis;
	
	@FXML
	private TableColumn<Corretor, String> colRegistro;
	
	@FXML
	private TableColumn<Corretor, Double> colAluguel;
	
	@FXML
	private TableColumn<Corretor, Boolean> colAlugado;
	
	@FXML
	private TableColumn<Corretor, String> colProprietario;
	
	@FXML
	private ComboBox<Pessoa> cbProprietarios;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cbProprietarios.setItems(
				FXCollections.observableArrayList(DbTeste.listaProprietarios()));
		
		colRegistro.setCellValueFactory(
				new PropertyValueFactory<Corretor, String>("registro"));
		colAluguel.setCellValueFactory(
				new PropertyValueFactory<Corretor, Double>("aluguel"));
		colAlugado.setCellValueFactory(
				new PropertyValueFactory<Corretor, Boolean>("alugado"));
		
		// DbTeste.acrescentaCorretor(new Corretor("Fulano de Tal", "123", "1234", "111", .05));
		// DbTeste.acrescentaCorretor(new Corretor("Beltrano de Tal", "222", "333", "444", .05));
		// DbTeste.acrescentaCorretor(new Corretor("Cicrano de Tal", "555", "666", "777", .05));
		
		//tblCorretores.setItems(
		//		FXCollections.observableArrayList(DbTeste.listaCorretores()));
	}
	
	@FXML
	private void cadastra() {
//		Corretor corretor = new Corretor(txtNome.getText(),
//				txtCpf.getText(),
//				txtTelefone.getText(),
//				txtCresci.getText(),
//				Double.parseDouble(txtCorretagem.getText()));
//		
//		DbTeste.acrescentaCorretor(corretor);
//		
//		tblCorretores.setItems(
//				FXCollections.observableArrayList(DbTeste.listaCorretores()));

		statusLabel.setText("Em construção...");
	}
	
}
