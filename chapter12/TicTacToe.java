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
import javafx.scene.control.Label;
import java.util.Random;

public class TicTacToe extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		
		Image x = new Image("file:X.png");
		ImageView xView = new ImageView(x);
		xView.setFitWidth(50);
		xView.setPreserveRatio(true);
		
		Image o = new Image("file:O.png");
		ImageView oView = new ImageView(o);
		oView.setFitWidth(50);
		oView.setPreserveRatio(true);
		
		Label winnerLabel = new Label();
		HBox winnerBox = new HBox(10, winnerLabel);
		winnerBox.setAlignment(Pos.CENTER);
		
		Button newGameButton = new Button("New Game");
		HBox buttonBox = new HBox(10, newGameButton);
		buttonBox.setAlignment(Pos.CENTER);
		
		GridPane gameBoard = new GridPane();
		gameBoard.setAlignment(Pos.CENTER);
		gameBoard.setHgap(10);
		gameBoard.setVgap(10);
		
		newGameButton.setOnAction(event -> {
			int[][] intArr = new int[3][3];
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					Random rand = new Random();
					int randomNum = rand.nextInt(2);
					intArr[i][j] = randomNum;
					if (randomNum == 0) {
						gameBoard.add(new ImageView(x), j, i);
					}
					else if (randomNum == 1) {
						gameBoard.add(new ImageView(o), j, i);
					}
				}
			}
			
			boolean xWins = false;
			boolean yWins = false;
			
			// check rows
			for (int i = 0; i < 3; i++) {
				int sum = 0;
				for (int j = 0; j < 3; j++) {
					sum += intArr[i][j];
				}
				if (sum == 0)
					xWins = true;
				if (sum == 3)
					yWins = true;
			}
			
			// check columns
			for (int i = 0; i < 3; i++) {
				int sum = 0;
				for (int j = 0; j < 3; j++) {
					sum += intArr[j][i];
				}
				if (sum == 0)
					xWins = true;
				if (sum == 3)
					yWins = true;
			}
			
			// check regular diagonal
			int sum = 0;
			for (int i = 0, j = 0; i < 3; i++, j++) {
				sum += intArr[i][j];
			}
			if (sum == 0)
				xWins = true;
			if (sum == 3)
				yWins = true;
			
			// check reverse diagonal
			sum = 0;
			for (int j = 2, i = 0; i < 3; i++, j--) {
				sum += intArr[i][j];
			}
			if (sum == 0)
				xWins = true;
			if (sum == 3)
				yWins = true;
			
			if (xWins && yWins)
				winnerLabel.setText("Draw!");
			else if (xWins)
				winnerLabel.setText("X Wins!");
			else if (yWins)
				winnerLabel.setText("O Wins!");
			else
				winnerLabel.setText("Scratch!");
			
		});
		
		VBox layout = new VBox(15, gameBoard, winnerBox, buttonBox);
		layout.setPadding(new Insets(15));
		
		Scene scene = new Scene(layout, 400, 400);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Tic-Tac-Toe Simulator");
		
		primaryStage.show();
		
	}

}
