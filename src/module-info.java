module testeJafx {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml, javafx.controls;
	opens gui to javafx.fxml;
	
	exports gui;
	
}
