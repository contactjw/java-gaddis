package chapter13;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class RadioButtonEvent extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		Image flowerImage = new Image("file:Flower.jpg");
		Image sunsetImage = new Image("file:Sunset.jpg");
		
		ImageView imageView = new ImageView(flowerImage);
		
		imageView.setFitWidth(200);
		imageView.setPreserveRatio(true);
		
		HBox imageHBox = new HBox(imageView);
		
		imageHBox.setAlignment(Pos.CENTER);
		
		RadioButton flowerRadio = new RadioButton("Flower");
		RadioButton sunsetRadio = new RadioButton("Sunset");
		
		flowerRadio.setSelected(true);
		
		ToggleGroup radioGroup = new ToggleGroup();
		flowerRadio.setToggleGroup(radioGroup);
		sunsetRadio.setToggleGroup(radioGroup);
		
		flowerRadio.setOnAction(event -> {
			imageView.setImage(flowerImage);
		});
		
		sunsetRadio.setOnAction(event -> {
			imageView.setImage(sunsetImage);
		});
		
		VBox radioVBox = new VBox(10, flowerRadio, sunsetRadio);
		
		radioVBox.setPadding(new Insets(30));
		
		VBox mainVBox = new VBox(10, imageHBox, radioVBox);
		
		Scene scene = new Scene(mainVBox);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

}
