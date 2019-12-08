package chapter8;

public class AreaDemo {

	public static void main(String[] args) {
		double areaCircle,
			   areaRectangle,
			   areaCylinder;
		
		areaCircle = Area.getArea(2.0);
		areaRectangle = Area.getArea(5, 3);
		areaCylinder = Area.getArea(4.3, 5.6);
		
		System.out.printf("Area of Circle with radius of 2.0: %.2f\n", areaCircle);
		System.out.printf("Area of Rectangle with length of 5 and width of 3: %.0f\n", areaRectangle);
		System.out.printf("Area of Cylinder with radius of 4.3 and height of 5.6: %.2f\n", areaCylinder);
	}

}
