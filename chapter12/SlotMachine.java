package chapter12;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.Random;

public class SlotMachine extends Application {
	private Image apple = new Image("file:Apple.bmp");
	private Image banana = new Image("file:Banana.bmp");
	private Image cherries = new Image("file:Cherries.bmp");
	private Image grapes = new Image("file:Grapes.bmp");
	private Image lemon = new Image("file:Lemon.bmp");
	private Image lime = new Image("file:Lime.bmp");
	private Image orange = new Image("file:Orange.bmp");
	private Image pear = new Image("file:Pear.bmp");
	private Image strawberry = new Image("file:Strawberry.bmp");
	private Image watermelon = new Image("file:Watermelon.bmp");

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		
		ImageView slot1 = new ImageView(cherries);
		ImageView slot2 = new ImageView(cherries);
		ImageView slot3 = new ImageView(cherries);
		
		HBox symbols = new HBox(10, slot1, slot2, slot3);
		symbols.setAlignment(Pos.CENTER);
		
		// Add the Amount Inserted label and text field.
		Label insertedLabel = new Label("Amount Inserted: $");
		TextField insertedField = new TextField("0.00");
		insertedField.setMaxWidth(95);
		
		HBox insertedBox = new HBox(insertedLabel, insertedField);
		
		// Add the Amount Won This Spin Labels
		Label wonThisSpinLabel = new Label("Amount Won This Spin: $");
		Label wonThisSpinField = new Label("0.00");
		
		HBox wonThisSpinBox = new HBox(wonThisSpinLabel, wonThisSpinField);
		
		// Add the Total Amount Won Labels
		Label totalWonLabel = new Label("Total Amount Won: $");
		Label totalWonField = new Label("0.00");
		
		HBox totalWonBox = new HBox(totalWonLabel, totalWonField);
		
		// Add the spin button
		Button spinButton = new Button("Spin");
		HBox buttonBox = new HBox(10, spinButton);
		buttonBox.setAlignment(Pos.CENTER);
		
		GridPane grid = new GridPane();
		grid.setHgap(50);
		grid.add(insertedBox, 0, 0);
		grid.add(wonThisSpinBox, 1, 0);
		grid.add(totalWonBox, 1, 1);
		grid.setAlignment(Pos.CENTER);
		
		VBox layout = new VBox(25, symbols, grid, buttonBox);
		layout.setPadding(new Insets(35));
		
		spinButton.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent e) {
				double userBet = Double.parseDouble(insertedField.getText());
				slot1.setImage(slotVal());
				slot2.setImage(slotVal());
				slot3.setImage(slotVal());
				
				if (slot1.getImage() == slot2.getImage() && slot2.getImage() == slot3.getImage()) {
					userBet *= 3.0;
					wonThisSpinField.setText(String.format("$%.2f", userBet));
					totalWonField.setText(String.format("%.2f", (Double.parseDouble(totalWonField.getText()) + userBet)));
				}
				else if (slot1.getImage() == slot2.getImage()) {
					userBet *= 2.0;
					wonThisSpinField.setText(String.format("%.2f", userBet));
					totalWonField.setText(String.format("%.2f", (Double.parseDouble(totalWonField.getText()) + userBet)));
				}
				else if (slot1.getImage() == slot3.getImage()) {
					userBet *= 2.0;
					wonThisSpinField.setText(String.format("%.2f", userBet));
					totalWonField.setText(String.format("%.2f", (Double.parseDouble(totalWonField.getText()) + userBet)));
				}
				else if (slot2.getImage() == slot3.getImage()) {
					userBet *= 2.0;
					wonThisSpinField.setText(String.format("%.2f", userBet));
					totalWonField.setText(String.format("%.2f", (Double.parseDouble(totalWonField.getText()) + userBet)));
				}
				else {
					wonThisSpinField.setText(String.format("%.2f", 0.00));
					totalWonField.setText(String.format("%.2f", (Double.parseDouble(totalWonField.getText()) + 0.00)));
				}
				
			}
		});
		
		Scene scene = new Scene(layout, 600, 350);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Slot Machine");
		
		primaryStage.show();
		
	}
	
	private Image slotVal() {
		Random rand = new Random();
		int randomNum = rand.nextInt(10);
		Image val = cherries;
		switch (randomNum) {
		case 0:
			val = apple;
			break;
		case 1:
			val = banana;
			break;
		case 2:
			val = cherries;
			break;
		case 3:
			val = grapes;
			break;
		case 4:
			val = lemon;
			break;
		case 5:
			val = lime;
			break;
		case 6:
			val = orange;
			break;
		case 7:
			val = pear;
			break;
		case 8:
			val = strawberry;
			break;
		case 9:
			val = watermelon;
			break;
		}
		
		return val;
	}
	

}
