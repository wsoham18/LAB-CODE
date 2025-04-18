package test;
import java.io.FileReader;
import java.io.IOException;
public class ReadToFile {

	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("Untitled.txt");
			int character;
			while((character=reader.read())!=-1) {
				System.out.print((char)character);
			}
		 reader.close();
		 }catch(IOException e) {
			 System.out.println("An error occurred");
		 }

	}

}
