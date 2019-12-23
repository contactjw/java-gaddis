package chapter11;
import java.io.*;

public class TestScoreDeserialDemo {

	public static void main(String[] args) throws Exception{
		
		TestScoreSerial[] newScores = new TestScoreSerial[5];
			
			
		FileInputStream iStream = new FileInputStream("TestScores.dat");
		ObjectInputStream inputStream = new ObjectInputStream(iStream);
		
		
		for (int i = 0; i < newScores.length; i++) {
			newScores[i] = (TestScoreSerial)inputStream.readObject();
		}
		
		for (int i = 0; i < newScores.length; i++) {
			System.out.println("Set #" + (i + 1));
			System.out.println(newScores[i]);
			System.out.println();
		}
		
		inputStream.close();
		
	}

}
