package chapter12;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

public class LatinTranslator extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Button word1 = new Button("Sinister");
		Button word2 = new Button("Dexter");
		Button word3 = new Button("Medium");
		
		word1.setMinWidth(100);
		word2.setMinWidth(100);
		word3.setMinWidth(100);
				
		Label english1 = new Label();
		Label english2 = new Label();
		Label english3 = new Label();
		
		english1.setMinWidth(100);
		english2.setMinWidth(100);
		english3.setMinWidth(100);

		HBox row1 = new HBox(20, word1, english1);
		HBox row2 = new HBox(20, word2, english2);
		HBox row3 = new HBox(20, word3, english3);
		
		row1.setAlignment(Pos.CENTER);
		row2.setAlignment(Pos.CENTER);
		row3.setAlignment(Pos.CENTER);

		VBox layout = new VBox(10, row1, row2, row3);
		layout.setAlignment(Pos.CENTER);
		layout.setPadding(new Insets(10));
				
		word1.setOnAction(event -> {
			english1.setText("Left");
		});
		
		word2.setOnAction(event -> {
			english2.setText("Right");
		});
		
		word3.setOnAction(event -> {
			english3.setText("Center");
		});
		
		Scene scene = new Scene(layout, 300, 200);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Latin Translator");
		
		primaryStage.show();
		
	}
}
