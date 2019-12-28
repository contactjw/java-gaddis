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

public class JoesAutomotive extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		
		Label serviceLabel = new Label("Service Cost");
		serviceLabel.setMinWidth(200);
		Label quantityLabel = new Label("Quantity");
		quantityLabel.setMinWidth(50);
		
		HBox serviceBox = new HBox(10, serviceLabel, quantityLabel);
		serviceBox.setAlignment(Pos.CENTER);
		
		Label oilLabel = new Label("Oil Change ($35.00): ");
		oilLabel.setMinWidth(200);
		TextField oilField = new TextField("0");
		oilField.setMinWidth(50);
		
		HBox oilBox = new HBox(10, oilLabel, oilField);
		oilBox.setAlignment(Pos.CENTER);
		
		Label lubeLabel = new Label("Lube Job ($25.00): ");
		lubeLabel.setMinWidth(200);
		TextField lubeField = new TextField("0");
		lubeField.setMinWidth(50);
		
		HBox lubeBox = new HBox(10, lubeLabel, lubeField);
		lubeBox.setAlignment(Pos.CENTER);
		
		Label radiatorLabel = new Label("Radiator Flush ($50.00): ");
		radiatorLabel.setMinWidth(200);
		TextField radiatorField = new TextField("0");
		radiatorField.setMinWidth(50);
		
		HBox radiatorBox = new HBox(10, radiatorLabel, radiatorField);
		radiatorBox.setAlignment(Pos.CENTER);
		
		Label transmissionLabel = new Label("Transmission Flush ($120.00): ");
		transmissionLabel.setMinWidth(200);
		TextField transmissionField = new TextField("0");
		transmissionField.setMinWidth(50);
		
		HBox transmissionBox = new HBox(10, transmissionLabel, transmissionField);
		transmissionBox.setAlignment(Pos.CENTER);
		
		Label inspectionLabel = new Label("Inspection ($35.00): ");
		inspectionLabel.setMinWidth(200);
		TextField inspectionField = new TextField("0");
		inspectionField.setMinWidth(50);
		
		HBox inspectionBox = new HBox(10, inspectionLabel, inspectionField);
		inspectionBox.setAlignment(Pos.CENTER);
		
		Label mufflerLabel = new Label("Muffler Replacement ($200.00): ");
		mufflerLabel.setMinWidth(200);
		TextField mufflerField = new TextField("0");
		mufflerField.setMinWidth(50);
		
		HBox mufflerBox = new HBox(10, mufflerLabel, mufflerField);
		mufflerBox.setAlignment(Pos.CENTER);
		
		Label tireLabel = new Label("Tire Rotation ($20.00): ");
		tireLabel.setMinWidth(200);
		TextField tireField = new TextField("0");
		tireField.setMinWidth(50);
		
		HBox tireBox = new HBox(10, tireLabel, tireField);
		tireBox.setAlignment(Pos.CENTER);
		
		Label otherLabel = new Label("Other Services ($60.00 per hour): ");
		otherLabel.setMinWidth(200);
		TextField otherField = new TextField("0");
		otherField.setMinWidth(50);
		
		HBox otherBox = new HBox(10, otherLabel, otherField);
		otherBox.setAlignment(Pos.CENTER);
		
		Label totalLabel = new Label("Total Expenses: ");
		totalLabel.setMinWidth(200);
		Label totalField = new Label("$0.00");
		totalField.setMinWidth(50);
		
		Button totalButton = new Button("Get Total");
		totalButton.setMinWidth(50);
		
		HBox totalButtonBox = new HBox(totalButton);
		totalButtonBox.setAlignment(Pos.CENTER);
		
		totalButton.setOnAction(event -> {
			
			double totalCharge = 0.0;
			
			totalCharge += (Double.parseDouble(oilField.getText()) * 35.00);
			totalCharge += (Double.parseDouble(lubeField.getText()) * 25.00);
			totalCharge += (Double.parseDouble(radiatorField.getText()) * 50.00);
			totalCharge += (Double.parseDouble(transmissionField.getText()) * 120.00);
			totalCharge += (Double.parseDouble(inspectionField.getText()) * 35.00);
			totalCharge += (Double.parseDouble(mufflerField.getText()) * 200.00);
			totalCharge += (Double.parseDouble(tireField.getText()) * 20.00);
			totalCharge += (Double.parseDouble(otherField.getText()) * 60.00);
			totalField.setText(String.format("$%,.2f", totalCharge));

		});
		
		HBox totalBox = new HBox(10, totalLabel, totalField);
		totalBox.setAlignment(Pos.CENTER);
		
		VBox layout = new VBox(15, serviceBox, oilBox, lubeBox, radiatorBox, transmissionBox, inspectionBox,
								   mufflerBox, tireBox, otherBox, totalButtonBox, totalBox);
		layout.setPadding(new Insets(15));
		
		Scene scene = new Scene(layout, 500, 550);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Joe's Automotive");
		
		primaryStage.show();
		
		
	}

}
