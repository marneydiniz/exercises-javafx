package layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class AnchorPaneTest extends AnchorPane {
	
	public AnchorPaneTest() {
		
		Square square1 = new Square();
		setTopAnchor(square1, 10.0);
		setLeftAnchor(square1, 10.0);
		
		Square square2 = new Square();
		setTopAnchor(square2, 10.0);
		setRightAnchor(square2, 10.0);
		
		Square square3 = new Square();
		setBottomAnchor(square3, 10.0);
		setLeftAnchor(square3, 10.0);
		
		Square square4 = new Square();
		setBottomAnchor(square4, 10.0);
		setRightAnchor(square4, 10.0);
		
		
		HBox centerSquare = new HBox();
		centerSquare.setAlignment(Pos.CENTER);
		setTopAnchor(centerSquare, 110.0);
		setBottomAnchor(centerSquare, 110.0);
		setRightAnchor(centerSquare, 110.0);
		setLeftAnchor(centerSquare, 110.0);
		
		Square square5 = new Square();
		centerSquare.getChildren().add(square5);
		
		getChildren().addAll(square1, square2, square3, square4, centerSquare);
		
	}

}
