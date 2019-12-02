package chapter6;

public class RoulettePocket {
	private int number;
	
	public RoulettePocket(int num) {
		number = num;
	}
	
	public String getPocketColor() {
		String color = "";
		if (number == 0)
			color = "green";
		else if (number > 0 && number <= 10)
			if (number % 2 == 0)
				color = "black";
			else
				color = "red";
		else if (number > 10 && number <= 18)
			if (number % 2 == 0)
				color = "red";
			else
				color = "black";
		else if (number > 18 && number <= 28)
			if (number % 2 == 0)
				color = "black";
			else
				color = "red";
		else if (number > 28 && number <= 36)
			if (number % 2 == 0)
				color = "red";
			else
				color = "black";
		
		return color;
	}
}
