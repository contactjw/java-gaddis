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

public class TipTaxTotal extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		// Add the label and textfield to enter total cost of meal.
		Label amountLabel = new Label("Total Meal Cost:");
		TextField amountField = new TextField();
		
		// Set the widths of the label and textfield.
		amountLabel.setMinWidth(100);
		amountField.setMinWidth(100);

		// Add the amountLabel and amountField to an HBox.
		HBox amountBox = new HBox(10, amountLabel, amountField);
		amountBox.setAlignment(Pos.CENTER);

		// Add the label and the label for tip amount.
		Label tipLabel = new Label("18% Tip: ");
		Label tipTotal = new Label();
		
		// Set the widths of the label and textfield.
		tipLabel.setMinWidth(100);
		tipTotal.setMinWidth(100);

		// Add the tipLabel and tipTotal to an HBox.
		HBox tipBox = new HBox(10, tipLabel, tipTotal);
		tipBox.setAlignment(Pos.CENTER);
		
		// Add the label and the label for sales tax amount.
		Label taxLabel = new Label("7% Sales Tax:");
		Label taxTotal = new Label();
		
		// Set the widths of the label and textfield.
		taxLabel.setMinWidth(100);
		taxTotal.setMinWidth(100);

		// Add the taxLabel and taxTotal to an HBox.
		HBox taxBox = new HBox(10, taxLabel, taxTotal);
		taxBox.setAlignment(Pos.CENTER);

		// Add the totalLabel and totalAmount Labels.
		Label totalLabel = new Label("Total Cost:");
		Label totalAmount = new Label();
		
		// Set the widths of the label and textfield.
		totalLabel.setMinWidth(100);
		totalAmount.setMinWidth(100);

		// Add the totalLabel and totalAmount label to an HBox.
		HBox totalBox = new HBox(10, totalLabel, totalAmount);
		totalBox.setAlignment(Pos.CENTER);

		// Create a calcButton
		Button calcButton = new Button("Calculate");
		calcButton.setMinWidth(75);
		
		HBox buttonBox = new HBox(calcButton);
		buttonBox.setAlignment(Pos.CENTER);
		
		// Create the action events when button is pressed.
		
		calcButton.setOnAction(event -> {
			double billAmount = Double.parseDouble(amountField.getText());
			double tipAmount = billAmount * 0.18;
			String tip = String.format("$%,.2f", tipAmount);
			tipTotal.setText(tip);
			
			double taxAmount = billAmount * 0.07;
			String tax = String.format("$%,.2f", taxAmount);
			taxTotal.setText(tax);
			
			double cost = billAmount + tipAmount + taxAmount;
			String totalC = String.format("$%,.2f", cost);
			totalAmount.setText(totalC);
			
		});

		// Add all of the HBoxes to a VBox.
		VBox vbox = new VBox(10, amountBox, tipBox, taxBox, totalBox, buttonBox);
		vbox.setPadding(new Insets(10));

		Scene scene = new Scene(vbox);

		primaryStage.setScene(scene);

		primaryStage.setTitle("Tip, Tax, and Total");

		primaryStage.show();

	}

}
