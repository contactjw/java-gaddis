package chapter13;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class SimpleMenu extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		final double WIDTH = 300.0, HEIGHT = 200.0;
		
		MenuBar menuBar = new MenuBar();
		
		Menu fileMenu = new Menu("File");
		MenuItem exitItem = new MenuItem("Exit");
		fileMenu.getItems().add(exitItem);
		
		exitItem.setOnAction(event -> {
			primaryStage.close();
		});
		
		menuBar.getMenus().add(fileMenu);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(menuBar);
		
		Scene scene = new Scene(borderPane, WIDTH, HEIGHT);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

}
