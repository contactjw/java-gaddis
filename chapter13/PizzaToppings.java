package chapter13;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class PizzaToppings extends Application {
	
	CheckBox pepperoniCheckBox;
	CheckBox cheeseCheckBox;
	CheckBox anchoviesCheckBox;
	Label totalLabel;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		pepperoniCheckBox = new CheckBox("Pepperoni $3.00");
		cheeseCheckBox = new CheckBox("Cheese $2.00");
		anchoviesCheckBox = new CheckBox("Anchovies $1.00");
				
		pepperoniCheckBox.setOnAction(new TotalButtonHandler());
		cheeseCheckBox.setOnAction(new TotalButtonHandler());
		anchoviesCheckBox.setOnAction(new TotalButtonHandler());
		
		totalLabel = new Label("$0.00");
		
		VBox checkBoxVBox = new VBox(10, pepperoniCheckBox, cheeseCheckBox, anchoviesCheckBox);
		
		VBox mainVBox = new VBox(10, checkBoxVBox, totalLabel);
		
		mainVBox.setAlignment(Pos.CENTER);
		
		mainVBox.setPadding(new Insets(10));
		
		Scene scene = new Scene(mainVBox);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	
	class TotalButtonHandler implements EventHandler<ActionEvent> {
		
		@Override
		public void handle(ActionEvent event) {
			double result = 0.0;
			
			if (pepperoniCheckBox.isSelected() == false && cheeseCheckBox.isSelected() == false && anchoviesCheckBox.isSelected() == false) {
				result = 0.00;
				totalLabel.setText(String.format("$%,.2f", result));
			}
			
			if (pepperoniCheckBox.isSelected()) {
				result += 3.00;
				totalLabel.setText(String.format("$%,.2f", result));
			}
			
			if (cheeseCheckBox.isSelected()) {
				result += 2.00;
				totalLabel.setText(String.format("$%,.2f", result));
			}
			
			if (anchoviesCheckBox.isSelected()) {
				result += 1.00;
				totalLabel.setText(String.format("$%,.2f", result));
			}
			
			
		}
	}

}
