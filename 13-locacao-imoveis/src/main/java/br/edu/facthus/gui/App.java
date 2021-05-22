package br.edu.facthus.gui;

import java.io.IOException;

import br.edu.facthus.db.DbTeste;
import br.edu.facthus.model.Corretor;
import br.edu.facthus.model.Imovel;
import br.edu.facthus.model.Pessoa;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private static Scene scene;

	public static void main(String[] args) {
		// Cria proprietários de teste
		DbTeste.acrescentaProprietario(new Pessoa("João Silva", "123.456.789-10", "(34) 3322-2233"));
		DbTeste.acrescentaProprietario(new Pessoa("Maria Souza", "987.654.321-00", "(34) 3322-2222"));
		DbTeste.acrescentaProprietario(new Pessoa("José Silva", "111.222.333-44", "(34) 3322-3333"));
		
		DbTeste.acrescentaCorretor(new Corretor("Fulano de Tal", "123", "1234", "111", .05));
		DbTeste.acrescentaCorretor(new Corretor("Beltrano de Tal", "222", "333", "444", .05));
		DbTeste.acrescentaCorretor(new Corretor("Cicrano de Tal", "555", "666", "777", .05));
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		scene = new Scene(loadFXML("main"), 640, 480);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = 
				new FXMLLoader(App.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}

}
