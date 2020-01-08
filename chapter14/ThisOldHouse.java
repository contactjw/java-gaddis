package chapter14;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ThisOldHouse extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		final double SCENE_WIDTH = 500;
		final double SCENE_HEIGHT = 500;
		
		Rectangle rectangle = new Rectangle(150, 150, 200, 200);
		rectangle.setFill(null);
		rectangle.setStroke(Color.BLACK);
		
		Rectangle door = new Rectangle(225, 270, 50, 80);
		door.setStroke(Color.BLACK);
		door.setFill(null);
		
		Rectangle window = new Rectangle(225, 190, 50, 50);
		window.setFill(null);
		window.setStroke(Color.BLACK);
		
		Line windowLine1 = new Line(225, 215, 275, 215);
		Line windowLine2 = new Line(250, 190, 250, 240);
		
		Line line1 = new Line(150, 150, 255, 75);
		Line line2 = new Line(255, 75, 350, 150);
		Line ground = new Line(0, 350, 499, 350);
		
		Pane pane = new Pane(rectangle, line1, line2, ground, door, window, windowLine1, windowLine2);
		
		Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}

}
