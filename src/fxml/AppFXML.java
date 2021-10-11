package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		String fileCss = getClass().getResource("/fxml/Login.css").toExternalForm();
		URL fileFXML = getClass().getResource("/fxml/Login.fxml");
		GridPane root = FXMLLoader.load(fileFXML);
		
		Scene scence = new Scene(root, 350, 350);
		scence.getStylesheets().add(fileCss);
		
		primaryStage.setResizable(false);
		primaryStage.setTitle("Login Screen");
		primaryStage.setScene(scence);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
