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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class MetricConverter extends Application {
	
	private TextField kiloTextField;
	private Label resultLabel;
	private RadioButton milesButton;
	private RadioButton feetButton;
	private RadioButton inchesButton;

	public static void main(String[] args) {
		launch(args);
	}

	
	public void start(Stage primaryStage ) {
		Label promptLabel = new Label("Enter a distance in kilometers: ");
		
		kiloTextField = new TextField();
		
		milesButton = new RadioButton("Convert to Miles");
		feetButton = new RadioButton("Convert to Feet");
		inchesButton = new RadioButton("Convert to Inches");
		
		milesButton.setSelected(true);
		
		ToggleGroup radioGroup = new ToggleGroup();
		milesButton.setToggleGroup(radioGroup);
		feetButton.setToggleGroup(radioGroup);
		inchesButton.setToggleGroup(radioGroup);
		
		Button calcButton = new Button("Convert");
		
		calcButton.setOnAction(new CalcButtonHandler());
		
		resultLabel = new Label();
		
		HBox promptHBox = new HBox(10, promptLabel, kiloTextField);
		
		HBox radioHBox = new HBox(20, milesButton, feetButton, inchesButton);
		
		VBox mainVBox = new VBox(10, promptHBox, radioHBox, calcButton, resultLabel);
		
		mainVBox.setAlignment(Pos.CENTER);
		
		mainVBox.setPadding(new Insets(10));
		
		Scene scene = new Scene(mainVBox);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Metric Converter");
		
		primaryStage.show();
	}
	
	class CalcButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			final double MILES_CONVERSION = 0.6214;
			final double FEET_CONVERSION = 3281.0;
			final double INCHES_CONVERSION = 39270.0;
			
			double result = 0;
			
			double kilometers = Double.parseDouble(kiloTextField.getText());
			
			if (milesButton.isSelected())
				result = kilometers * MILES_CONVERSION;
			
			if (feetButton.isSelected()) 
				result = kilometers * FEET_CONVERSION;
			
			if (inchesButton.isSelected())
				result = kilometers * INCHES_CONVERSION;
			
			resultLabel.setText(String.format("%,.2f", result));
		}
	}
}
