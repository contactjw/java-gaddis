package chapter13;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class SkateboardDesigner extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Label deckLabel = new Label("Select a Deck");
		
		ListView<String> deckListView = new ListView<>();
		deckListView.getItems().addAll("The Master Thrasher: $60.00", "The Dictator: $45.00", "The Street King: $50.00");
		deckListView.setPrefSize(75, 120);
		
		Label truckLabel = new Label("Select Trucks");
		
		ListView<String> truckListView = new ListView<>();
		truckListView.getItems().addAll("7.75-inch axle: $35.00", "8-inch axle: $40.00", "8.5-inch axle: $45.00");
		truckListView.setPrefSize(75, 120);

		
		Label wheelLabel = new Label("Select Wheels");
		
		// An example of converting an array to an Observable list and using that as a argument for ListView.
		String[] wheelTypes = {"51 mm: $20.00", "55 mm: $22.00", "58 mm: $24.00", "61 mm: $28.00"};
		
		ObservableList<String> strList = FXCollections.observableArrayList(wheelTypes);
		
		ListView<String> wheelListView = new ListView<>(strList);
		wheelListView.setPrefSize(75, 120);

		
		Label miscLabel = new Label("Misc. Parts");
		
		CheckBox gripCheckBox = new CheckBox("Grip Tape: $10.00");
		CheckBox bearingsCheckBox = new CheckBox("Bearings$ $30.00");
		CheckBox riserPadsCheckBox = new CheckBox("Riser Pads: $2.00");
		CheckBox nutsAndBoltsCheckBox = new CheckBox("Nuts & Bolts Kit: $3.00");
		
		HBox miscHBox = new HBox(10, gripCheckBox, bearingsCheckBox, riserPadsCheckBox, nutsAndBoltsCheckBox);
		miscHBox.setAlignment(Pos.CENTER);
		
		Button calcButton = new Button("Get Total");
		
		Label preTaxLabel = new Label("Pre-Tax Cost: ");
		Label preTaxValue = new Label("$0.00");
		HBox preTaxHBox = new HBox(preTaxLabel, preTaxValue);
		preTaxHBox.setAlignment(Pos.CENTER);
		
		Label salesTaxLabel = new Label("Sales Tax: ");
		Label salesTaxValue = new Label("$0.00");
		HBox salesTaxHBox = new HBox(salesTaxLabel, salesTaxValue);
		salesTaxHBox.setAlignment(Pos.CENTER);
		
		Label totalCostLabel = new Label("Total Cost: ");
		Label totalCostValue = new Label("$0.00");
		HBox totalCostHBox = new HBox(totalCostLabel, totalCostValue);
		totalCostHBox.setAlignment(Pos.CENTER);
		
		
		VBox layout = new VBox(15, deckLabel, deckListView, truckLabel, truckListView,
							       wheelLabel, wheelListView, miscLabel, miscHBox, calcButton, preTaxHBox, salesTaxHBox, totalCostHBox);
		layout.setAlignment(Pos.CENTER);
		layout.setPadding(new Insets(10));
		
		calcButton.setOnAction(event -> {
			final double TAX_PERCENT = 0.07;
			double subTotal = 0.0;
			double salesTax = 0.0;
			double totalCost = 0.0;
			
			if (deckListView.getSelectionModel().getSelectedIndex() == 0)
				subTotal += 60.00;
			else if (deckListView.getSelectionModel().getSelectedIndex() == 1)
				subTotal += 45.00;
			else if (deckListView.getSelectionModel().getSelectedIndex() == 2)
				subTotal += 50.00;
			
			if (truckListView.getSelectionModel().getSelectedIndex() == 0)
				subTotal += 35.00;
			else if (truckListView.getSelectionModel().getSelectedIndex() == 1)
				subTotal += 40.00;
			else if (truckListView.getSelectionModel().getSelectedIndex() == 2)
				subTotal += 45.00;
			
			if (wheelListView.getSelectionModel().getSelectedIndex() == 0)
				subTotal += 20.00;
			else if (wheelListView.getSelectionModel().getSelectedIndex() == 1)
				subTotal += 22.00;
			else if (wheelListView.getSelectionModel().getSelectedIndex() == 2)
				subTotal += 24.00;
			else if (wheelListView.getSelectionModel().getSelectedIndex() == 3)
				subTotal += 28.00;
			
			if (gripCheckBox.isSelected())
				subTotal += 10.00;
			if (bearingsCheckBox.isSelected())
				subTotal += 30.00;
			if (riserPadsCheckBox.isSelected())
				subTotal += 2.00;
			if (nutsAndBoltsCheckBox.isSelected())
				subTotal += 3.00;
			
			preTaxValue.setText(String.format("$%,.2f", subTotal));
			
			salesTax = TAX_PERCENT * subTotal;
			
			salesTaxValue.setText(String.format("$%,.2f", salesTax));
			
			totalCost = salesTax + subTotal;
			
			totalCostValue.setText(String.format("$%,.2f", totalCost));
			
		});
		
		Scene scene = new Scene(layout, 600, 550);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Board Builder");
		
		primaryStage.show();
		
	}

}
