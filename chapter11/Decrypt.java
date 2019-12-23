package chapter11;
import java.io.*;

public class Decrypt {
	
	public static void decryptFile(String encryptedFile, String decryptedFile) throws IOException{
		
		FileInputStream iStream = new FileInputStream(encryptedFile);
		DataInputStream inputStream = new DataInputStream(iStream);
		
		FileOutputStream oStream = new FileOutputStream(decryptedFile);
		DataOutputStream outputStream = new DataOutputStream(oStream);
		
		boolean endOfFile = false;
		
		while (!endOfFile) {
			try {
				byte b = inputStream.readByte();
				b -= 10;
				
				outputStream.writeByte(b);
			} 
			catch(IOException e) {
				endOfFile = true;
			}
		}
		
		inputStream.close();
		outputStream.close();
		
	}
	
}
