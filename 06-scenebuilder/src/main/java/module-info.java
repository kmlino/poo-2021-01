module br.edu.facthus.scenebuilder {
	requires javafx.controls;
	requires javafx.fxml;

	opens br.edu.facthus.scenebuilder to javafx.fxml;
	exports br.edu.facthus.scenebuilder;
}