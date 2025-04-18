package test;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AlternateCharacterCopy {

	public static void main(String[] args) {
	try {
	     FileReader reader=new FileReader("Untitled.txt");
		FileWriter writer=new FileWriter("Untitled.txt");
			int character;
			int index=0;
			while((character=reader.read())!=-1) {
				if (index %2==0) {
					writer.write(character);
					index++;
			  }
				System.out.println("Alternate characters copied successfully!");
			}
	} catch (IOException e) {
				System.out.println("An error occurred"+e.getMessage());
	}
			
			
		}

	}


