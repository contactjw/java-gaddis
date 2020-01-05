package chapter13;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class SliderDemo extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		
		final double MIN = 0.0, MAX = 100.0, INITIAL = 0.0;
		final double MAJOR_TICK_UNIT = 20.0;
		final int MINOR_TICK_COUNT = 5;
		final double SLIDER_WIDTH = 300.0;
		
		final double LABEL_WIDTH = 50.0;
		final double SPACING = 10.0;
		
		Label fDescriptor = new Label("Fahrenheit: ");
		Label fLabel = new Label("32.0");
		fLabel.setStyle("-fx-border-style: solid; -fx-alignment: center");
		fLabel.setPrefWidth(LABEL_WIDTH);
		HBox fHBox = new HBox(SPACING, fDescriptor, fLabel);
		fHBox.setAlignment(Pos.CENTER);
		
		Label cDescriptor = new Label("Celsius: ");
		Label cLabel = new Label("0.0");
		cLabel.setStyle("-fx-border-style: solid; -fx-alignment: center");
		cLabel.setPrefWidth(LABEL_WIDTH);
		HBox cHBox = new HBox(SPACING, cDescriptor, cLabel);
		cHBox.setAlignment(Pos.CENTER);
		
		Slider slider = new Slider(MIN, MAX, INITIAL);
		slider.setShowTickMarks(true);
		slider.setMajorTickUnit(MAJOR_TICK_UNIT);
		slider.setMinorTickCount(MINOR_TICK_COUNT);
		slider.setShowTickLabels(true);
		slider.setSnapToTicks(true);
		slider.setPrefWidth(SLIDER_WIDTH);
		
		slider.valueProperty().addListener(
				(observeable, oldvalue, newvalue) -> 
		{
			double celsius = slider.getValue();
			
			double fahrenheit = (9.0 / 5.0) * celsius + 32;
			
			cLabel.setText(String.format("%.1f", celsius));
			fLabel.setText(String.format("%.1f", fahrenheit));
			
		});
		
		VBox vbox = new VBox(10, fHBox, cHBox, slider);
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(SPACING));
		
		Scene scene = new Scene(vbox);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
		
		
		
	}

}
