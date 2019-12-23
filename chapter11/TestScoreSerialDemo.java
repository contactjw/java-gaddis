package chapter11;
import java.io.*;

public class TestScoreSerialDemo {
	
	public static void main(String[] args) throws IOException, InvalidTestScore{
		
		final int NUM_SCORES = 5;
		
		try {
			double[] scoresArr1 = {95.4, 96.5, 94.3};
			double[] scoresArr2 = {96.5, 76.7, 86.9};
			double[] scoresArr3 = {90.3, 73.7, 80.9};
			double[] scoresArr4 = {86.5, 70.7, 67.9};
			double[] scoresArr5 = {80.5, 79.7, 99.9};
			
			TestScoreSerial[] allScores = new TestScoreSerial[NUM_SCORES];
	
			allScores[0] = new TestScoreSerial(scoresArr1);
			allScores[1] = new TestScoreSerial(scoresArr2);
			allScores[2] = new TestScoreSerial(scoresArr3);
			allScores[3] = new TestScoreSerial(scoresArr4);
			allScores[4] = new TestScoreSerial(scoresArr5);
			
			FileOutputStream oStream = new FileOutputStream("TestScores.dat");
			ObjectOutputStream outputStream = new ObjectOutputStream(oStream);
			
			for (int i = 0; i < allScores.length; i++) {
				System.out.println("Serializing Object #" + i);
				outputStream.writeObject(allScores[i]);
			}
			
			System.out.println("All test scores serialized.");
			
			outputStream.close();
		}catch (IllegalArgumentException e)
	      {
	         System.out.println("Invalid score found.\n" + e.getMessage());
	      }
	      catch (IOException e)
	      {
	         System.out.println("Error - " + e.getMessage());
	      }
	}
	
}
