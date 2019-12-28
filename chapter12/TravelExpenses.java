package chapter12;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TravelExpenses extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		Label daysLabel = new Label("Days on Trip: ");
		daysLabel.setMinWidth(150);
		TextField daysField = new TextField("0");
		daysField.setMinWidth(75);
		
		HBox daysBox = new HBox(10, daysLabel, daysField);
		daysBox.setAlignment(Pos.CENTER);
		
		Label airfareLabel = new Label("Airfare Cost: ");
		airfareLabel.setMinWidth(150);
		TextField airfareField = new TextField("0");
		airfareField.setMinWidth(75);
		
		HBox airfareBox = new HBox(10, airfareLabel, airfareField);
		airfareBox.setAlignment(Pos.CENTER);
		
		Label carLabel = new Label("Car Rental Fees: ");
		carLabel.setMinWidth(150);
		TextField carField = new TextField("0");
		carField.setMinWidth(75);
		
		HBox carBox = new HBox(10, carLabel, carField);
		carBox.setAlignment(Pos.CENTER);
		
		Label milesLabel = new Label("Miles Driven: ");
		milesLabel.setMinWidth(150);
		TextField milesField = new TextField("0");
		milesField.setMinWidth(75);
		
		HBox milesBox = new HBox(10, milesLabel, milesField);
		milesBox.setAlignment(Pos.CENTER);
		
		Label parkingLabel = new Label("Parking Fees: ");
		parkingLabel.setMinWidth(150);
		TextField parkingField = new TextField("0");
		parkingField.setMinWidth(75);
		
		HBox parkingBox = new HBox(10, parkingLabel, parkingField);
		parkingBox.setAlignment(Pos.CENTER);

		Label taxiLabel = new Label("Taxi Fees: ");
		taxiLabel.setMinWidth(150);
		TextField taxiField = new TextField("0");
		taxiField.setMinWidth(75);
		
		HBox taxiBox = new HBox(10, taxiLabel, taxiField);
		taxiBox.setAlignment(Pos.CENTER);
		
		Label conferenceLabel = new Label("Conference/Seminar Fees: ");
		conferenceLabel.setMinWidth(150);
		TextField conferenceField = new TextField("0");
		conferenceField.setMinWidth(75);
		
		HBox conferenceBox = new HBox(10, conferenceLabel, conferenceField);
		conferenceBox.setAlignment(Pos.CENTER);
		
		Label lodgingLabel = new Label("Lodging Charges: ");
		lodgingLabel.setMinWidth(150);
		TextField lodgingField = new TextField("0");
		lodgingField.setMinWidth(75);
		
		HBox lodgingBox = new HBox(10, lodgingLabel, lodgingField);
		lodgingBox.setAlignment(Pos.CENTER);
		
		Button calcButton = new Button("Calculate");
		calcButton.minWidth(50);
		
		HBox buttonBox = new HBox(10, calcButton);
		buttonBox.setAlignment(Pos.CENTER);
		
		Label expensesLabel = new Label("Total Expenses: ");
		expensesLabel.setMinWidth(150);
		Label expensesDisplay = new Label();
		expensesDisplay.setMinWidth(75);
		
		HBox expensesBox = new HBox(10, expensesLabel, expensesDisplay);
		expensesBox.setAlignment(Pos.CENTER);
		
		Label allowedTotalLabel = new Label("Allowable Expenses: ");
		allowedTotalLabel.setMinWidth(150);
		Label allowedTotalDisplay = new Label();
		allowedTotalDisplay.setMinWidth(75);
		
		HBox allowedTotalBox = new HBox(10, allowedTotalLabel, allowedTotalDisplay);
		allowedTotalBox.setAlignment(Pos.CENTER);
		
		Label amountOwedLabel = new Label("Amount Owed: ");
		amountOwedLabel.setMinWidth(150);
		Label amountOwedDisplay = new Label();
		amountOwedDisplay.setMinWidth(75);
		
		HBox amountOwedBox = new HBox(10, amountOwedLabel, amountOwedDisplay);
		amountOwedBox.setAlignment(Pos.CENTER);
		
		Label amountSavedLabel = new Label("Amount Saved: ");
		amountSavedLabel.setMinWidth(150);
		Label amountSavedDisplay = new Label();
		amountSavedDisplay.setMinWidth(75);
		
		HBox amountSavedBox = new HBox(10, amountSavedLabel, amountSavedDisplay);
		amountSavedBox.setAlignment(Pos.CENTER);
		
		VBox layout = new VBox(20, daysBox, airfareBox, carBox, milesBox, parkingBox,
								   taxiBox, conferenceBox, lodgingBox, buttonBox, expensesBox,
								   allowedTotalBox, amountOwedBox, amountSavedBox);
		layout.setPadding(new Insets(15));
		
		calcButton.setOnAction(event -> {
			
			int numDays = Integer.parseInt(daysField.getText());
			
			double totalExpenses = 0.0;
			totalExpenses += Double.parseDouble(airfareField.getText());
			totalExpenses += Double.parseDouble(carField.getText());
			totalExpenses += Double.parseDouble(parkingField.getText());
			totalExpenses += Double.parseDouble(taxiField.getText());
			totalExpenses += Double.parseDouble(conferenceField.getText());
			totalExpenses += Double.parseDouble(lodgingField.getText());
			expensesDisplay.setText(String.format("$%,.2f", totalExpenses));
			
			double allowableExpenses = 0.0;
			allowableExpenses += 47.0 * numDays;
			allowableExpenses += 20.0 * numDays;
			allowableExpenses += 40.0 * numDays;
			allowableExpenses += 195.0 * numDays;
			allowableExpenses += 0.42 * Double.parseDouble(milesField.getText());
			allowedTotalDisplay.setText(String.format("$%,.2f", allowableExpenses));
			
			double amountOwed = 0.0;
			if (totalExpenses > allowableExpenses) {
				amountOwed = totalExpenses - allowableExpenses;
			}
			amountOwedDisplay.setText(String.format("$%,.2f", amountOwed));
			
			double amountSaved = 0.0;
			if (totalExpenses < allowableExpenses) {
				amountSaved = allowableExpenses - totalExpenses;
			}
			amountSavedDisplay.setText(String.format("$%,.2f", amountSaved));
			
		});
		
		Scene scene = new Scene(layout, 600, 600);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Travel Expenses");
		
		primaryStage.show();
		
		
	}

}
