package chapter13;
import java.io.*;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class ShoppingCartSystem extends Application {
	
	private double subTotal = 0.0;
	private double salesTax = 0.0;
	private double totalCost = 0.0;
	private final double TAX_PERCENT = 0.07;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		// Create a VBox for the total prices when the user checks out.
		Label subtotalLabel = new Label("Subtotal: $0.00");
		Label salesTaxLabel = new Label("Sales Tax: $0.00");
		Label totalLabel = new Label("Total: $0.00");
		VBox priceVBox = new VBox(10, subtotalLabel, salesTaxLabel, totalLabel);
		priceVBox.setAlignment(Pos.CENTER);
		
		// Create the available books ListView
		Label booksLabel = new Label("Available Books");
		ListView<String> books = new ListView<>();
		books.setPrefSize(210, 210);
		
		VBox booksVBox = new VBox(10, booksLabel, books);
		
		// Create the shoppingCart ListView
		Label cartLabel = new Label("Shopping Cart");
		ListView<String> shoppingCart = new ListView<>();
		shoppingCart.setPrefSize(210, 210);
		
		VBox cartVBox = new VBox(10, cartLabel, shoppingCart);
		
		// Load the available books ListView
		File file = new File("BookPrices.txt");
		Scanner input = new Scanner(file);
		
		while (input.hasNext()) {
			String line = input.nextLine();
			
			books.getItems().addAll(line);
		}
		
		// Add the available books and the shopping cart to an HBox
		HBox cartsHBox = new HBox(10, booksVBox, cartVBox);
		cartsHBox.setAlignment(Pos.CENTER);
		
		// Create buttons for user to modify shopping cart
		Button addItemButton = new Button("Add Item");
		Button removeItemButton = new Button("Remove Item");
		Button clearItemsButton = new Button("Clear Items");
		Button checkOutButton = new Button("Check Out");
		
		HBox buttonHBox = new HBox(10, addItemButton, removeItemButton, clearItemsButton, checkOutButton);
		buttonHBox.setAlignment(Pos.CENTER);
		
		// Create action event handlers for the buttons
		addItemButton.setOnAction(event -> {
			shoppingCart.getItems().addAll((books.getSelectionModel().getSelectedItem()));
			
			if (books.getSelectionModel().getSelectedIndex() == 0)
				subTotal += 11.95;
			if (books.getSelectionModel().getSelectedIndex() == 1)
				subTotal += 14.50;
			if (books.getSelectionModel().getSelectedIndex() == 2)
				subTotal += 29.95;
			if (books.getSelectionModel().getSelectedIndex() == 3)
				subTotal += 18.50;
			if (books.getSelectionModel().getSelectedIndex() == 4)
				subTotal += 12.95;
			if (books.getSelectionModel().getSelectedIndex() == 5)
				subTotal += 10.95;
			if (books.getSelectionModel().getSelectedIndex() == 6)
				subTotal += 14.50;
		});
		
		removeItemButton.setOnAction(event -> {
			shoppingCart.getItems().remove(shoppingCart.getSelectionModel().getSelectedIndex());
			if (books.getSelectionModel().getSelectedIndex() == 0)
				subTotal -= 11.95;
			if (books.getSelectionModel().getSelectedIndex() == 1)
				subTotal -= 14.50;
			if (books.getSelectionModel().getSelectedIndex() == 2)
				subTotal -= 29.95;
			if (books.getSelectionModel().getSelectedIndex() == 3)
				subTotal -= 18.50;
			if (books.getSelectionModel().getSelectedIndex() == 4)
				subTotal -= 12.95;
			if (books.getSelectionModel().getSelectedIndex() == 5)
				subTotal -= 10.95;
			if (books.getSelectionModel().getSelectedIndex() == 6)
				subTotal -= 14.50;
		});
		
		clearItemsButton.setOnAction(event -> {
			shoppingCart.getItems().clear();
			subTotal = 0.00;
		});
		
		checkOutButton.setOnAction(event -> {
			salesTax = subTotal * TAX_PERCENT;
			totalCost = salesTax + subTotal;
			subtotalLabel.setText(String.format("Subtotal: $%,.2f", subTotal));
			salesTaxLabel.setText(String.format("Sales Tax: $%,.2f", salesTax));
			totalLabel.setText(String.format("Total: $%,.2f", totalCost));
		});
			
		
		// Add final layout to the layout variable
		VBox layout = new VBox(10, cartsHBox, buttonHBox, priceVBox);
		layout.setAlignment(Pos.CENTER);
		layout.setPadding(new Insets(10));
		
		// Standard scene setting
		Scene scene = new Scene(layout);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
		input.close();
	}

}
