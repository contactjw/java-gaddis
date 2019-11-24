package chapter5;
import javax.swing.JOptionPane;
//Insert any necessary import statements here.

public class RectangleArea {
	public static void main(String[] args) {
		
	   double length,    // The rectangle's length
	          width,     // The rectangle's width
	          area;      // The rectangle's area
	
	   // Get the rectangle's length from the user.
	   length = getLength();
	
	   // Get the rectangle's width from the user.
	   width = getWidth();
	
	   // Get the rectangle's area.
	   area = getArea(length, width);
	
	   // Display the rectangle data.
	   displayData(length, width, area);
	   
	   System.exit(0);
	}
	
	public static double getLength() {
		String input;
		double length;
		
		input = JOptionPane.showInputDialog("Enter the rectangle's length: ");
		length = Double.parseDouble(input);

		return length;
	}
	
	public static double getWidth() {
		String input;
		double width;
		
		input = JOptionPane.showInputDialog("Enter the rectangle's width: ");
		width = Double.parseDouble(input);

		return width;
	}
	
	public static double getArea(double length, double width) {
		return length * width;
	}
	
	public static void displayData(double length, double width, double area) {
		JOptionPane.showMessageDialog(null, "Rectangle's Length: " + length +
											"\nRectangle's Width: " + width +
											"\nRectangle's Area:  " + area);
	}
}


