package chapter13;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ConferenceRegistration extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		
		ToggleGroup admissionGroup = new ToggleGroup();
		
		Label registrationLabel = new Label("Registration Type");
		
		Label generalLabel = new Label("General Admission: $895.00");
		RadioButton generalButton = new RadioButton();
		generalButton.setToggleGroup(admissionGroup);
		generalButton.setSelected(true);
		
		Label studentLabel = new Label("Student Admission: $495.00");
		RadioButton studentButton = new RadioButton();
		studentButton.setToggleGroup(admissionGroup);
		
		HBox admissionHBox = new HBox(10, generalLabel, generalButton, studentLabel, studentButton);
		admissionHBox.setAlignment(Pos.CENTER);
		
		
		CheckBox dinnerCheckBox = new CheckBox("Opening Night Dinner: $30.00");
		
		Label workshopLabel = new Label("Optional Workshops: $495.00 each");
		CheckBox eCommerceCheckBox = new CheckBox("Introduction to E-commerce");
		CheckBox webCheckBox = new CheckBox("The Future of the Web");
		CheckBox javaCheckBox = new CheckBox("Advanced Java Programming");
		CheckBox networkCheckBox = new CheckBox("Network Security");
		
		GridPane checkBoxes = new GridPane();
		checkBoxes.add(eCommerceCheckBox, 0, 0);
		checkBoxes.add(webCheckBox, 0, 1);
		checkBoxes.add(javaCheckBox, 1, 0);
		checkBoxes.add(networkCheckBox, 1, 1);
		
		checkBoxes.setAlignment(Pos.CENTER);
		checkBoxes.setHgap(10);
		checkBoxes.setVgap(10);
		
		Button calcButton = new Button("Get Total");
		
		Label totalLabel = new Label("Total Cost: ");
		Label totalValue = new Label("$0.00");
		
		HBox totalHBox = new HBox(10, totalLabel, totalValue);
		totalHBox.setAlignment(Pos.CENTER);
		
		calcButton.setOnAction(event -> {
			double totalCost = 0.0;
			
			if (generalButton.isSelected())
				totalCost += 895.00;
			else if (studentButton.isSelected())
				totalCost += 495.00;
			
			if (dinnerCheckBox.isSelected())
				totalCost += 30.00;
			
			if (eCommerceCheckBox.isSelected())
				totalCost += 495.00;
			if (webCheckBox.isSelected())
				totalCost += 495.00;
			if (javaCheckBox.isSelected())
				totalCost += 495.00;
			if (networkCheckBox.isSelected())
				totalCost += 495.00;
			
			totalValue.setText(String.format("$%,.2f", totalCost));
		});
		
		VBox layout = new VBox(10, registrationLabel, admissionHBox, dinnerCheckBox, workshopLabel, checkBoxes, calcButton, totalHBox);
		layout.setAlignment(Pos.CENTER);
		layout.setPadding(new Insets(10));
		
		
		Scene scene = new Scene(layout);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Conference Registration");
		
		primaryStage.show();
		
	}

}
