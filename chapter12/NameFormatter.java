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

public class NameFormatter extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		Label firstNameLabel = new Label("First Name: ");
		firstNameLabel.setMinWidth(150);
		Label middleNameLabel = new Label("Middle Name: ");
		middleNameLabel.setMinWidth(150);
		Label lastNameLabel = new Label("Last Name: ");
		lastNameLabel.setMinWidth(150);
		Label titleLabel = new Label("Preferred Title: ");
		titleLabel.setMinWidth(150);
		
		TextField firstNameField = new TextField();
		firstNameField.setMinWidth(150);
		TextField middleNameField = new TextField();
		middleNameField.setMinWidth(150);
		TextField lastNameField = new TextField();
		lastNameField.setMinWidth(150);
		TextField titleField = new TextField();
		titleField.setMinWidth(150);
		
		HBox firstNameBox = new HBox(10, firstNameLabel, firstNameField);
		firstNameBox.setAlignment(Pos.CENTER);
		HBox middleNameBox = new HBox(10, middleNameLabel, middleNameField);
		middleNameBox.setAlignment(Pos.CENTER);
		HBox lastNameBox = new HBox(10, lastNameLabel, lastNameField);
		lastNameBox.setAlignment(Pos.CENTER);
		HBox titleBox = new HBox(10, titleLabel, titleField);
		titleBox.setAlignment(Pos.CENTER);
		
		GridPane nameFormat = new GridPane();
		nameFormat.setHgap(10);
		nameFormat.setVgap(10);
		nameFormat.setAlignment(Pos.CENTER);
		
		Button format1 = new Button("Title First Middle Last");
		format1.setMinWidth(200);
		Button format2 = new Button("First Middle Last");
		format2.setMinWidth(200);
		Button format3 = new Button("First Last");
		format3.setMinWidth(200);
		Button format4 = new Button("Last, First Middle, Title");
		format4.setMinWidth(200);
		Button format5 = new Button("Last, First Middle");
		format5.setMinWidth(200);
		Button format6 = new Button("Last, First");
		format6.setMinWidth(200);

		
		nameFormat.add(format1, 0, 0);
		nameFormat.add(format2, 0, 1);
		nameFormat.add(format3, 0, 2);
		nameFormat.add(format4, 1, 0);
		nameFormat.add(format5, 1, 1);
		nameFormat.add(format6, 1, 2);
		
		Label displayName = new Label();
		HBox displayNameBox = new HBox(displayName);
		displayNameBox.setMinHeight(50);
		displayNameBox.setAlignment(Pos.CENTER);
		
		format1.setOnAction(event -> {
			String name = "";
			name += titleField.getText();
			name += " " + firstNameField.getText();
			name += " " + middleNameField.getText();
			name += " " + lastNameField.getText();
			displayName.setText(name);
		});
		
		format2.setOnAction(event -> {
			String name = "";
			name += firstNameField.getText();
			name += " " + middleNameField.getText();
			name += " " + lastNameField.getText();
			displayName.setText(name);
		});
		
		format3.setOnAction(event -> {
			String name = "";
			name += firstNameField.getText();
			name += " " + lastNameField.getText();
			displayName.setText(name);
		});
		
		format4.setOnAction(event -> {
			String name = "";
			name += lastNameField.getText();
			name += ", " + firstNameField.getText();
			name += " " + middleNameField.getText();
			name += ", " + titleField.getText();
			displayName.setText(name);
		});
		
		format5.setOnAction(event -> {
			String name = "";
			name += lastNameField.getText();
			name += ", " + firstNameField.getText();
			name += " " + middleNameField.getText();
			displayName.setText(name);
		});
		
		format6.setOnAction(event -> {
			String name = "";
			name += lastNameField.getText();
			name += ", " + firstNameField.getText();
			displayName.setText(name);
		});
		
		VBox vbox = new VBox(10, firstNameBox, middleNameBox, lastNameBox, titleBox, nameFormat, displayNameBox);
		vbox.setPadding(new Insets(15));
		
		Scene scene = new Scene(vbox, 500, 400);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Name Formatter");
		
		primaryStage.show();
		
	}

}
