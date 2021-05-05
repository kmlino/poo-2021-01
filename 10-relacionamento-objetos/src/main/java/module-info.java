module br.edu.facthus.gui {
	requires javafx.controls;
	requires javafx.fxml;

	opens br.edu.facthus.gui to javafx.fxml;
	exports br.edu.facthus.gui;
}