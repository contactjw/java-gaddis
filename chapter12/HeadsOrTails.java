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

public class HeadsOrTails extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		Image coinState = new Image("file:heads1.png");
		ImageView coinStateView = new ImageView(coinState);
		coinStateView.setFitWidth(100);
		coinStateView.setPreserveRatio(true);
				
		HBox imageBox = new HBox(10, coinStateView);
		imageBox.setAlignment(Pos.CENTER);
		
		Button flipCoin = new Button("Flip Coin");
		
		HBox buttonBox = new HBox(10, flipCoin);
		buttonBox.setAlignment(Pos.CENTER);

		VBox layout = new VBox(10, imageBox, buttonBox);
		layout.setPadding(new Insets(10));
		
		// Add the EventHandler.
		flipCoin.setOnAction(event -> {
			Random rand = new Random();
			
			int randomNum = rand.nextInt(2);
			
			if (randomNum == 0) {
				coinStateView.setImage(new Image("file:heads1.png"));

			}
			else if (randomNum == 1) {
				coinStateView.setImage(new Image("file:tails1.png"));
			}
		});
		
		Scene scene = new Scene(layout, 300, 200);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Heads or Tails");
		
		primaryStage.show();
		
	}

}
