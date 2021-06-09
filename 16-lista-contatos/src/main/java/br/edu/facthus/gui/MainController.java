package br.edu.facthus.gui;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.facthus.dao.ContatosDAO;
import br.edu.facthus.exception.CustomException;
import br.edu.facthus.model.Contato;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;

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
	
	@FXML
	private Label lblMensagem;

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
		colId.setCellValueFactory(new PropertyValueFactory<Contato, Integer>("id"));
		
		colNome.setCellFactory(TextFieldTableCell.<Contato>forTableColumn());
		colNome.setCellValueFactory(new Callback<CellDataFeatures<Contato, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Contato, String> p) {
				return p.getValue().getNomeProperty();
			}
		});

		colEmail.setCellFactory(TextFieldTableCell.<Contato>forTableColumn());
		colEmail.setCellValueFactory(new Callback<CellDataFeatures<Contato, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Contato, String> p) {
				return p.getValue().getEmailProperty();
			}
		});
		
		try {
			tblContatos.setItems(FXCollections.observableArrayList(contatosDAO.pesquisaContatos()));
		} catch (CustomException e) {
			lblMensagem.setText(e.getMessage());
		}
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
			tblContatos.setItems(FXCollections.observableArrayList(contatosDAO.pesquisaContatos()));
			info("Contato cadastrado com sucesso!");
		} catch (CustomException e) {
			error(e.getMessage());
		}
	}

	@FXML
	private void atualiza() {
		try {
			Contato contato = tblContatos.getSelectionModel().getSelectedItem();
			contatosDAO.atualiza(contato);
			tblContatos.setItems(FXCollections.observableArrayList(contatosDAO.pesquisaContatos()));
			info("Contato atualizado com sucesso!");
		} catch (CustomException e) {
			error(e.getMessage());
		}
	}
	
	@FXML
	private void remove() {
		try {
			Contato contato = tblContatos.getSelectionModel().getSelectedItem();
			contatosDAO.remove(contato);
			tblContatos.setItems(FXCollections.observableArrayList(contatosDAO.pesquisaContatos()));
			info("Contato removido com sucesso!");
		} catch (CustomException e) {
			error(e.getMessage());
		}
	}

}
