package chapter11;
import java.io.*;

public class FileArray {
	public static void main(String[] args) {
		
		try {
			
			int[] intArray = {5, 4, 3, 2, 1};
			int[] emptyArr = new int[intArray.length];
			
			String file = "binaryExample.dat";
			
			writeArray(file, intArray);
			readArray(file, emptyArr);
			
			for (int i = 0; i < emptyArr.length; i++) {
				System.out.print(emptyArr[i] + " ");
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void writeArray(String fileName, int[] arr) throws IOException{
		FileOutputStream fStream = new FileOutputStream(fileName);
		DataOutputStream outputStream = new DataOutputStream(fStream);
		
		for (int i = 0; i < arr.length; i++) {
			outputStream.writeInt(arr[i]);
		}
		
		outputStream.close();
	}
	
	
	public static void readArray(String fileName, int[] arr) throws IOException{
		FileInputStream iStream = new FileInputStream(fileName);
		DataInputStream inputStream = new DataInputStream(iStream);
		
		boolean endOfFile = false;
		int count = 0;
		
		while (!endOfFile) {
			try {
				arr[count] = inputStream.readInt();
				count++;
			}catch (Exception e) {
				endOfFile = true;
			}
		}
		
		inputStream.close();
	}
}
