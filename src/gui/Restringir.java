package gui;

import javafx.scene.control.TextField;

public class Restringir {

	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
		if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
		txt.setText(oldValue);
		}
		});
}
}
