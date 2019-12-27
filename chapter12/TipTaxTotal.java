package chapter12;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TipTaxTotal extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		// Add the label and textfield to enter total cost of meal.
		Label amountLabel = new Label("Total Meal Cost: ");
		TextField amountField = new TextField();
		
		// Add the amountLabel and amountField to an HBox.
		HBox amountBox = new HBox(10, amountLabel, amountField);
		
		// Add the label and the label for tip amount. 
		Label tipLabel = new Label("18% Tip: ");
		Label tipTotal = new Label();
		
		// Add the tipLabel and tipTotal to an HBox.
		HBox tipBox = new HBox(tipLabel, tipTotal);
		
		// Add the label and the label for sales tax amount. 
		Label taxLabel = new Label("7% Sales Tax: ");
		Label taxTotal = new Label();
		
		// Add the taxLabel and taxTotal to an HBox.
		HBox taxBox = new HBox(10, taxLabel, taxTotal);
		
		// Add the totalLabel and totalAmount Labels.
		Label totalLabel = new Label("Total Cost: ");
		Label totalAmount = new Label();
		
		// Add the totalLabel and totalAmount label to an HBox.
		HBox totalBox = new HBox(10, totalLabel, totalAmount);
		
		// Create a calcButton
		Button calcButton = new Button("Calculate");
		calcButton.setMinWidth(75);
		
		// Add all of the HBoxes to a VBox.
		VBox vbox = new VBox(10, amountBox, tipBox, taxBox, totalBox, calcButton);
		
		Scene scene = new Scene(vbox);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Tip, Tax, and Total");

		primaryStage.show();
		
		
		
	}

}
