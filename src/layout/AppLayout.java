package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = null;
		
//		root = new AnchorPaneTest();
//		root = new BorderPaneTest();
//		root = new FlowPaneTest();
//		root = new GridPaneTest();
//		root = new StackPaneTest();
		root = new TilePaneTest();
		
		Scene mainScene = new Scene(root, 800, 600);
		
		primaryStage.setScene(mainScene);
		primaryStage.setTitle("Layout Manager");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}

}
