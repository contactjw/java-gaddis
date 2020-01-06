package chapter13;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class SmartPhonePackages extends Application {
	
	private Menu dataMenu;
	private RadioMenuItem pack1;
	private RadioMenuItem pack2;
	private RadioMenuItem pack3;
	
	private Menu phoneMenu;
	private RadioMenuItem phone1;
	private RadioMenuItem phone2;
	private RadioMenuItem phone3;
	
	private Menu addOnsMenu;
	private CheckMenuItem insurance;
	private CheckMenuItem hotSpot;
	
	private Label dataLabel;
	private Label phoneLabel;
	private Label insuranceLabel;
	private Label hotSpotLabel;
	
	private double dataCost = 0.0;
	private double phoneCost = 0.0;
	private double insuranceCost = 0.0;
	private double hotSpotCost = 0.0;
	

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		MenuBar menuBar = new MenuBar();
		
		dataLabel = new Label("Data Cost: $0.00");
		phoneLabel = new Label("Phone Cost: $0.00");
		insuranceLabel = new Label("Insurance Cost: $0.00");
		hotSpotLabel = new Label("HotSpot Cost: $0.00");
		
		VBox prices = new VBox(10, dataLabel, phoneLabel, insuranceLabel, hotSpotLabel);
		prices.setAlignment(Pos.CENTER);
		prices.setPadding(new Insets(15));
		
		buildDataMenu();
		buildPhoneMenu();
		buildAddsMenu();
		
		menuBar.getMenus().addAll(dataMenu, phoneMenu, addOnsMenu);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(menuBar);
		borderPane.setCenter(prices);
		
		Scene scene = new Scene(borderPane, 500, 500);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
	
	private void buildDataMenu() {
		
		dataMenu = new Menu("Data Plan");
		pack1 = new RadioMenuItem("8 gigabytes per month +$45.00 per month");
		pack2 = new RadioMenuItem("16 gigabytes per month +$65.00 per month");
		pack3 = new RadioMenuItem("20 gigabytes per month +$99.00 per month");
		dataMenu.getItems().addAll(pack1, pack2, pack3);
		
		ToggleGroup dataGroup = new ToggleGroup();
		pack1.setToggleGroup(dataGroup);
		pack2.setToggleGroup(dataGroup);
		pack3.setToggleGroup(dataGroup);
		
		pack1.setOnAction(event -> {
			dataCost = 45.00;
			dataLabel.setText(String.format("Data Cost: $%,.2f", dataCost));
		});
		
		pack2.setOnAction(event -> {
			dataCost = 65.00;
			dataLabel.setText(String.format("Data Cost: $%,.2f", dataCost));
		});
		
		pack3.setOnAction(event -> {
			dataCost = 99.00;
			dataLabel.setText(String.format("Data Cost: $%,.2f", dataCost));
		});
		
		
		
	}
	
	private void buildPhoneMenu() {
		
		phoneMenu = new Menu("Phone Model");
		
		phone1 = new RadioMenuItem("Model 100 +$299.95");
		phone2 = new RadioMenuItem("Model 110 +$399.95");
		phone3 = new RadioMenuItem("Model 200 +$499.95");
		phoneMenu.getItems().addAll(phone1, phone2, phone3);
		
		ToggleGroup phoneGroup = new ToggleGroup();
		
		phone1.setToggleGroup(phoneGroup);
		phone2.setToggleGroup(phoneGroup);
		phone3.setToggleGroup(phoneGroup);
		
		phone1.setOnAction(event -> {
			phoneCost = 299.95;
			phoneLabel.setText(String.format("Phone Cost: $%,.2f", phoneCost));
		});
		
		phone2.setOnAction(event -> {
			phoneCost = 399.95;
			phoneLabel.setText(String.format("Phone Cost: $%,.2f", phoneCost));
		});
		
		phone3.setOnAction(event -> {
			phoneCost = 499.95;
			phoneLabel.setText(String.format("Phone Cost: $%,.2f", phoneCost));
		});
		
	}
	
	private void buildAddsMenu() {
		addOnsMenu = new Menu("Add-Ons");
		
		insurance = new CheckMenuItem("Phone Replacement Insurance +$5.00 per month");
		hotSpot = new CheckMenuItem("WiFi Hotspot Capability +$10.00 per month");
		addOnsMenu.getItems().addAll(insurance, hotSpot);
		
		insurance.setOnAction(event -> {
			insuranceCost = 5.00;
			insuranceLabel.setText(String.format("Insurance Cost: $%,.2f", insuranceCost));
		});
		
		hotSpot.setOnAction(event -> {
			hotSpotCost = 10.00;
			hotSpotLabel.setText(String.format("HotSpot Cost: $%,.2f", hotSpotCost));
		});
		
	}
}
