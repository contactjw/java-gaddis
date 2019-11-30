package chapter6;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;	

public class TemperatureDemo {

	public static void main(String[] args) {
		DecimalFormat df2 = new DecimalFormat("#.##");
		String input;
		double ftemp;
		
		input = JOptionPane.showInputDialog("Enter the fahrenheit temperature.");
		ftemp = Double.parseDouble(input);
		
		Temperature t = new Temperature(ftemp);
		
		JOptionPane.showMessageDialog(null, "Fahrenheit Temperature: " + df2.format(t.getFahrenheit()) +
											"\nCelsius Temperature: " + df2.format(t.getCelsius()) +
											"\nKelvin Temperature: " + df2.format(t.getKelvin()));
		
		System.exit(0);
	}

}
