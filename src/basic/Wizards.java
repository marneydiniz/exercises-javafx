package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizards extends Application{
	
	private Stage wizard;
	private Scene step1;
	private Scene step2;
	private Scene step3;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		wizard = primaryStage;
		
		createStep1();
		createStep2();
		createStep3();
		
		wizard.setScene(step1);
		wizard.setTitle("Wizards :: Step 01");
		wizard.show();
		
	}
	
	private void createStep1(){
		Button nextStep = new Button("Go to Step 2 >>");
		nextStep.setOnAction(e -> {
			wizard.setScene(step2);
			wizard.setTitle("Wizards :: Step 02");
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(nextStep);
		
		step1 = new Scene(box, 400, 400);
	}
	
	private void createStep2(){
		Button nextStep = new Button("Go to Step 3 >>");
		nextStep.setOnAction(e -> {
			wizard.setScene(step3);
			wizard.setTitle("Wizards :: Step 03");
		});
		
		Button backStep = new Button("<< Back to Step 1");
		backStep.setOnAction(e -> {
			wizard.setScene(step1);
			wizard.setTitle("Wizards :: Step 01");
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(backStep);
		box.getChildren().add(nextStep);
		
		step2 = new Scene(box, 400, 400);
	}
	
	private void createStep3(){
		Button finishButton = new Button("Finish");
		finishButton.setOnAction(e -> {
			System.exit(0);
		});
		
		Button backStep = new Button("<< Back to Step 2");
		backStep.setOnAction(e -> {
			wizard.setScene(step2);
			wizard.setTitle("Wizards :: Step 02");
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(backStep);
		box.getChildren().add(finishButton);
		
		step3 = new Scene(box, 400, 400);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
