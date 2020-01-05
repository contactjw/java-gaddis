package chapter13;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class ConsoleDebugging extends Application {
	
	private TextField kiloTextField;
	private Label resultLabel;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		
		Label promptLabel = new Label("Enter a distance in kilometers");
		
		kiloTextField = new TextField();
		
		Button calcButton = new Button("Convert");
		
		calcButton.setOnAction(event -> {
			System.out.printf("Reading %s from the text field. \n", kiloTextField.getText());
			
			System.out.printf("Converted value: %f\n", Double.parseDouble(kiloTextField.getText()));
			
			Double kilometers = Double.parseDouble(kiloTextField.getText());
			
			Double miles = kilometers * 0.6214;
			
			resultLabel.setText(String.format("%,.2f miles", miles));
			
			System.out.println("Ready for the next input.");
		});
		
		resultLabel = new Label();
		
		HBox hbox = new HBox(10, promptLabel, kiloTextField);
		
		VBox vbox = new VBox(10, hbox, calcButton, resultLabel);
		
		vbox.setAlignment(Pos.CENTER);
		
		vbox.setPadding(new Insets(10));
		
		Scene scene = new Scene(vbox);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Kilometer Converter");
		
		primaryStage.show();
		
		
	}

}
