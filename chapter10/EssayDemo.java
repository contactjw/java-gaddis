package chapter10;

public class EssayDemo {
	public static void main(String[] args) {
		Essay essay1 = new Essay(15, 10, 20, 15);
		
		// we must set the score.. was thinking about doing this in the constructor.
		essay1.setScore();
		
		System.out.println(essay1);
	}
}
