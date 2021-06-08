module br.edu.facthus.gui {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires java.sql;

	opens br.edu.facthus.gui to javafx.fxml;
	opens br.edu.facthus.model;
	
	exports br.edu.facthus.gui;
}