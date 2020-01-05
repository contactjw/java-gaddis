package chapter13;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ListViewDemo4 extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		final double WIDTH = 120, HEIGHT = 140;
		
		ListView<String> listView1 = new ListView<>();
		listView1.setPrefSize(WIDTH, HEIGHT);
		listView1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		listView1.getItems().addAll("January", "February", "March", "April", "May", "June",
									"July", "August", "September", "October", "November", "December");
		
		ListView<String> listView2 = new ListView<>();
		listView2.setPrefSize(WIDTH, HEIGHT);
		
		Button getButton = new Button("Get Selections");
		
		getButton.setOnAction(event -> {
			ObservableList<String> selections = listView1.getSelectionModel().getSelectedItems();
			
			listView2.getItems().setAll(selections);
		});
		
		VBox vbox = new VBox(10, listView1, listView2, getButton);
		vbox.setPadding(new Insets(10));
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vbox);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
		
		
		
	}

}
