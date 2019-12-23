package chapter11;
import java.io.*;

public class DecryptDemo {

	public static void main(String[] args) throws IOException{
		
		System.out.println("Decrypting Hidden Message.");
		
		Decrypt.decryptFile("Encryption.txt", "HiddenMessage.txt");
		
		System.out.println("The Hidden Message is Ready in HiddenMessage.txt");
		
	}

}
