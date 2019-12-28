package chapter12;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import java.util.Random;

public class DiceSimulator extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		Image die1 = new Image("file:die1.bmp");
		ImageView die1View = new ImageView(die1);
		die1View.setFitWidth(120);
		die1View.setPreserveRatio(true);
		
		Image die2 = new Image("file:die1.bmp");
		ImageView die2View = new ImageView(die2);
		die2View.setFitWidth(120);
		die2View.setPreserveRatio(true);
		
		HBox diceBox = new HBox(30, die1View, die2View);
		diceBox.setAlignment(Pos.CENTER);
		
		Button roll = new Button("Roll");
		roll.setMinWidth(50);
		HBox buttonBox = new HBox(roll);
		buttonBox.setAlignment(Pos.CENTER);
		
		VBox layout = new VBox(25, diceBox, buttonBox);
		layout.setPadding(new Insets(15));
		
		Scene scene = new Scene(layout, 400, 225);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Dice");
		
		primaryStage.show();
		
		roll.setOnAction(event -> {
			Random rand = new Random();
			
			int randomNum1 = rand.nextInt(6) + 1;
			int randomNum2 = rand.nextInt(6) + 1;
			
			die1View.setImage(new Image("file:die" + randomNum1 + ".bmp"));
			die2View.setImage(new Image("file:die" + randomNum2 + ".bmp"));
			
		});
		
	}

}
