package br.edu.facthus.hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("Bem vindo ao JavaFX!");
		StackPane root = new StackPane();
		root.getChildren().add(0,label);
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("POO - 2021/01");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
