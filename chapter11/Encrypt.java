package chapter11;
import java.io.*;

public class Encrypt {
	
	public static void encryptFile(String normalFile, String encryptedFile) throws IOException{
		
		boolean endOfFile = false;
		
		FileInputStream iStream = new FileInputStream(normalFile);
		DataInputStream inputStream = new DataInputStream(iStream);
		
		FileOutputStream oStream = new FileOutputStream(encryptedFile);
		DataOutputStream outputStream = new DataOutputStream(oStream);
		
		while (!endOfFile) {
			try {
				byte b = inputStream.readByte();
				
				b += 10;
				
				outputStream.writeByte(b);
			} catch (IOException e) {
				endOfFile = true;
			}
		}
		
		outputStream.close();
		inputStream.close();
		
	}
}
