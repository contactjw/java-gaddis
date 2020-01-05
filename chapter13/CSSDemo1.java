package chapter13;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class CSSDemo1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		Label myLabel = new Label("Hello World");
		Button myButton = new Button("Click Me");
		
		VBox vbox = new VBox(10, myLabel, myButton);
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(10));
		
		Scene scene = new Scene(vbox);
		
		scene.getStylesheets().add(CSSDemo1.class.getResource("demo1.css").toExternalForm());
				
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}

}
