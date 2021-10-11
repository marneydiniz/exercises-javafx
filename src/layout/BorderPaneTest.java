package layout;

import javafx.scene.layout.BorderPane;

public class BorderPaneTest extends BorderPane {
	
	public BorderPaneTest() {
		
		Box b1 = new Box().withText("TOP");
		setTop(b1);
		
		Box b2 = new Box().withText("BOTTON");
		setBottom(b2);
		
		Box b3 = new Box().withText("LEFT");
		setLeft(b3);
		
		Box b4 = new Box().withText("RIGHT");
		setRight(b4);
		
		Box b5 = new Box().withText("CENTER");
		setCenter(b5);
		
	}

}
