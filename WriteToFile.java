package test;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter writer=new FileWriter("Untitled.txt");
			writer.write("Hello,this is a file handling example in Java!");
			writer.close();
			System.out.println("Successfully wrote to the file.");
			
		}catch(IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

}
