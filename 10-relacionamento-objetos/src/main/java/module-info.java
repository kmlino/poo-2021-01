module br.edu.facthus.gui {
	requires javafx.controls;
	requires javafx.fxml;

	opens br.edu.facthus.gui to javafx.fxml;
	opens br.edu.facthus.model to javafx.base;
	exports br.edu.facthus.gui;
}