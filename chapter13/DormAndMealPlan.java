package chapter13;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class DormAndMealPlan extends Application {
	private double totalCost;
	private Label costLabel;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Label dormLabel = new Label("Select a Dormitory");
		
		ComboBox<String> dormComboBox = new ComboBox<>();
		dormComboBox.getItems().addAll("Allen Hall: $1,800 per Semester", "Pike Hall: $2,200 per Semester",
				                       "Farthing Hall: $2,800 per Semester", "University Suites: $3,000 per Semester");
		
		Label mealLabel = new Label("Selected a Meal Plan");
		
		ComboBox<String> mealComboBox = new ComboBox<>();
		
		mealComboBox.getItems().addAll("7 Meals Per Week: $600 per Semester", "14 Meals Per Week: $1,100 per Semester",
									   "Unlimited Meals: $1,800 per Semester");
		
		
		Button calcButton = new Button("Calculate");
		
		calcButton.setOnAction(event -> {
			totalCost = 0.0;
			
			// Set total for dormitory selected
			if (dormComboBox.getSelectionModel().getSelectedIndex() == 0)
				totalCost += 1800;
			if (dormComboBox.getSelectionModel().getSelectedIndex() == 1)
				totalCost += 2200;
			if (dormComboBox.getSelectionModel().getSelectedIndex() == 2)
				totalCost += 2800;
			if (dormComboBox.getSelectionModel().getSelectedIndex() == 3)
				totalCost += 3000;
			
			// Set total for meal plan selected
			if (mealComboBox.getSelectionModel().getSelectedIndex() == 0)
				totalCost += 600;
			if (mealComboBox.getSelectionModel().getSelectedIndex() == 1)
				totalCost += 1100;
			if (mealComboBox.getSelectionModel().getSelectedIndex() == 2)
				totalCost += 1800;
			
			costLabel.setText(String.format("Total Cost: $%,.2f", totalCost));
		});
		
		
		costLabel = new Label("Select a dorm and meal plan.");

		VBox layout = new VBox(10, dormLabel, dormComboBox, mealLabel, mealComboBox, calcButton, costLabel);
		layout.setAlignment(Pos.CENTER);
		layout.setPadding(new Insets(10));
		
		Scene scene = new Scene(layout, 350, 250);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Student Housing Expenses");
		
		primaryStage.show();
		
		
	}

}
