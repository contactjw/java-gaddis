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
import javafx.scene.control.TextField;

public class PropertyTax extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		
		Label propertyLabel = new Label("Enter the value of the property:");
		TextField propertyField = new TextField();
		
		// Set minWidths
		propertyLabel.minWidth(100);
		propertyField.minWidth(100);
		
		// Add the property values to an HBox.
		HBox propertyBox = new HBox(10, propertyLabel, propertyField);
		propertyBox.setAlignment(Pos.CENTER);
		
		Label assessmentLabel = new Label("Assessment Value:");
		Label assessmentTotal = new Label();
		
		// Set minWidths
		assessmentLabel.minWidth(100);
		assessmentTotal.minWidth(100);
		
		// Add the assessment values to an HBox.
		HBox assessmentBox = new HBox(10, assessmentLabel, assessmentTotal);
		assessmentBox.setAlignment(Pos.CENTER);
		
		Label taxLabel = new Label("Property Tax:");
		Label taxTotal = new Label();
		
		// Set minWidths
		taxLabel.minWidth(100);
		taxTotal.minWidth(100);
		
		// Add the tax values to an HBox.
		HBox taxBox = new HBox(10, taxLabel, taxTotal);
		taxBox.setAlignment(Pos.CENTER);
		
		Button calcButton = new Button("Calculate Tax");
		
		// Add the button to an HBox to allow for formatting.
		HBox calcBox = new HBox(calcButton);
		calcBox.setAlignment(Pos.CENTER);
		
		// Add the three values to a VBox
		VBox layout = new VBox(10, propertyBox, assessmentBox, taxBox, calcBox);
		layout.setPadding(new Insets(10));
		
		// Set the ActionEvent for the calcButton.
		calcButton.setOnAction(event -> {
			
			double propVal = Double.parseDouble(propertyField.getText());
			
			double assessmentVal = propVal * 0.60;
			assessmentTotal.setText(String.format("$%,.2f", assessmentVal));
			
			double taxVal = assessmentVal / 100 * 0.64;
			
			taxTotal.setText(String.format("$%,.2f", taxVal));
			
		});
		
		Scene scene = new Scene(layout, 500, 150);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Property Tax");
		
		primaryStage.show();
		
	}

}
