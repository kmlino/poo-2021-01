package br.edu.facthus.gui;

import java.io.IOException;

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
		// launch(args);
		Pessoa p1 = new Pessoa("João da Silva", 
				"123.456.789-10", 
				"(34) 3322-1122");
		
		Imovel i1 = new Imovel("A123",
				700.00,
				p1);
				
		System.out.printf("Registro: %s\n"
				+ "Aluguel: %.2f\n"
				+ "Proprietário: %s\n"
				+ "Alugado: %b\n",
				i1.getRegistro(),
				i1.getAluguel(), 
				i1.getProprietario().getNome(),
				i1.isAlugado());
		
		Corretor c1 = new Corretor("Maria da Silva",
				"987.654.321-00",
				"(34) 3333-2222",
				"MG111",
				0.1);
		
		i1.setCorretor(c1);
		i1.setAlugado(true);
		
		System.out.printf("Registro: %s\n"
				+ "Aluguel: %.2f\n"
				+ "Proprietário: %s\n"
				+ "Corretor: %s\n"
				+ "Alugado: %b\n",
				i1.getRegistro(),
				i1.getAluguel(), 
				i1.getProprietario().getNome(),
				i1.getCorretor().getNome(),
				i1.isAlugado());
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
