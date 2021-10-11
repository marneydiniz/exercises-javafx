package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;

public class LoginControler {
	
	@FXML
	private javafx.scene.control.TextField emailField;
	@FXML
	private PasswordField passwordField;
	
	public void login() {
		boolean validEmail = emailField.getText().equals("marneydiniz@gmail.com");
		boolean validPassword = passwordField.getText().equals("tami2307");
		
		if (validEmail && validPassword) {
			Notifications.create().position(Pos.TOP_RIGHT).title("Login FXML").text("Success Login!!").showInformation();
		} else {
			Notifications.create().position(Pos.TOP_RIGHT).title("Login FXML").text("Failed Login!!").showError();
		}
		
	}

}
