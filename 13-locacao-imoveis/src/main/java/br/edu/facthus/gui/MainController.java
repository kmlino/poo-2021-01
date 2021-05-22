package br.edu.facthus.gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
	
	private void mostraJanela(String nomeFxml, String titulo) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource(nomeFxml));
			Scene scene = new Scene(fxmlLoader.load(), 640, 480);
			Stage stage = new Stage();
			stage.setTitle(titulo);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private void abreJanelaProprietarios() {
		mostraJanela("proprietarios.fxml", "Cadastro de Proprietários");
	}
	
	@FXML
	private void abreJanelaCorretores() {
		mostraJanela("corretores.fxml", "Cadastro de Corretores");
	}
	
	@FXML
	private void abreJanelaImoveis() {
		mostraJanela("imoveis.fxml", "Cadastro de Imóveis");
	}

}
