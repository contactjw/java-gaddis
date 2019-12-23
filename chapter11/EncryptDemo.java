package chapter11;
import java.io.*;

public class EncryptDemo {
	public static void main(String[] args) throws IOException{
		
		System.out.println("Encrypting File: Regular.txt");
		
		Encrypt.encryptFile("Regular.txt", "Encryption.txt");
		
		System.out.println("Secret File Generated.");
	}
}
