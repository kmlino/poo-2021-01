package br.edu.facthus.scenebuilder;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
	
	private void mostraExercicio(String nomeFxml, String titulo) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource(nomeFxml));
			Scene scene = new Scene(fxmlLoader.load(), 630, 400);
			Stage stage = new Stage();
			stage.setTitle(titulo);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private void ex01() {
		mostraExercicio("exercicio01.fxml", "Exercício 01");
	}
	
	@FXML
	private void ex02() {
		mostraExercicio("exercicio02.fxml", "Exercício 02");
	}
	
	@FXML
	private void ex03() {
		mostraExercicio("exercicio03.fxml", "Exercício 031");
	}
	
	

}
