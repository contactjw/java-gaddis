package chapter4;
import javax.swing.JOptionPane;
import java.io.*;

public class PersonalWebPageGenerator {
	public static void main(String[] args) throws IOException {
		String userName,
			   userSentence;
		
		userName = JOptionPane.showInputDialog("Enter your name: ");
		
		userSentence = JOptionPane.showInputDialog("Describe yourself: ");
		
		File file = new File("htmlPage.html");
		PrintWriter outputFile = new PrintWriter(file);
		
		outputFile.println("<html>");
		outputFile.println("<head>");
		outputFile.println("</head>");
		outputFile.println("<body>");
		outputFile.println("\t<center>");
		outputFile.println("\t\t<h1>" + userName + "</h1>");
		outputFile.println("\t</center>");
		outputFile.println("\t<hr />");
		outputFile.println(userSentence);
		outputFile.println("\t<hr />");
		outputFile.println("</body>");
		outputFile.println("</html>");
		
		outputFile.close();
		
	}
}
