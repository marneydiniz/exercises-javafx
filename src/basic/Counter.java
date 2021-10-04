package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Counter extends Application{
	
	private int counter = 0;
	
	private void appButtonStyle(Label label) {
		label.setText(Integer.toString(counter));
		label.getStyleClass().removeAll("green", "red");

		if (counter > 0) {
			label.getStyleClass().add("green");
		} else if (counter < 0) {
			label.getStyleClass().add("red");
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label titleLabel = new Label("Counter");
		titleLabel.getStyleClass().add("title");
		
		Label numberLabel = new Label("0");
		numberLabel.getStyleClass().add("number");
		
		Button subButton = new Button("-");
		subButton.getStyleClass().add("buttons");
		subButton.setOnAction(e -> {
			counter--;
			appButtonStyle(numberLabel);
		});
		
		Button addButton = new Button("+");
		addButton.getStyleClass().add("buttons");
		addButton.setOnAction(e -> {
			counter++;
			appButtonStyle(numberLabel);
		});
		
		HBox buttonsBox = new HBox();
		buttonsBox.setAlignment(Pos.CENTER);
		buttonsBox.setSpacing(10);
		buttonsBox.getChildren().add(subButton);
		buttonsBox.getChildren().add(addButton);
		
		VBox mainBox = new VBox();
		mainBox.getStyleClass().add("content");
		mainBox.setAlignment(Pos.CENTER);
		buttonsBox.setSpacing(10);
		mainBox.getChildren().add(titleLabel);
		mainBox.getChildren().add(numberLabel);
		mainBox.getChildren().add(buttonsBox);
		
		String css = getClass().getResource("/basic/Counter.css").toExternalForm();
		Scene mainScene = new Scene(mainBox, 400, 400);
		mainScene.getStylesheets().add(css);
		mainScene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
