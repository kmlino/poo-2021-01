package br.edu.facthus.gui;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.facthus.dao.ContatosDAO;
import br.edu.facthus.exception.CustomException;
import br.edu.facthus.model.Contato;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable {
	
	@FXML
	private TextField txtNome;
	
	@FXML
	private TextField txtEmail;
	
	@FXML
	private TableView<Contato> tblContatos;
	
	@FXML
	private TableColumn<Contato, Integer> colId;
	
	@FXML
	private TableColumn<Contato, String> colNome;
	
	@FXML
	private TableColumn<Contato, String> colEmail;
	
	private Contato contato;
	
	private ContatosDAO contatosDAO;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		contatosDAO = new ContatosDAO();
		contato = new Contato();
		
		// Binding dos txts
		txtNome.textProperty().bindBidirectional(contato.getNomeProperty());
		txtEmail.textProperty().bindBidirectional(contato.getEmailProperty());
		
		// Inicialização da tabela
		colId.setCellValueFactory(
				new PropertyValueFactory<Contato, Integer>("id"));
		colNome.setCellValueFactory(
				new PropertyValueFactory<Contato, String>("nome"));
		colEmail.setCellValueFactory(
				new PropertyValueFactory<Contato, String>("email"));
		
		tblContatos.setItems(FXCollections.observableArrayList(
				contatosDAO.pesquisaContatos()));
	}
	
	private void info(String mensagem) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText(mensagem);
		alert.show();
	}
	
	private void error(String mensagem) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setHeaderText(mensagem);
		alert.show();
	}
		
	@FXML
	private void criaBD() {
		try {
			contatosDAO.criaBD();
			info("Banco de dados criado com sucesso!");
		} catch (CustomException e) {
			error(e.getMessage());
		}
	}
	
	@FXML
	private void cadastra() {
		try {
			contatosDAO.insereContato(contato);
			
			tblContatos.setItems(FXCollections.observableArrayList(
					contatosDAO.pesquisaContatos()));
			
			info("Contato cadastrado com sucesso!");
		} catch (CustomException e) {
			error(e.getMessage());
		}
	}
	
}
