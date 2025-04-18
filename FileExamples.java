package text;
import java.io.File;
import java.io.IOException;


public class FileExamples {

	public static void main(String[] args) {
		File file=new File("https://1drv.ms/f/c/92df8a6ad5b9e324/EgbNexthtodHph8VnKNnwhEB2HyEdPUE47WlPY1XqB1PiQ?e=EZ3fZH-");
		try {
			if(file.createNewFile()) {
				System.out.println("File created:"+ file.getName());
			}else {
				System.out.println("File already exists");}
				
			
			}catch (IOException e) {
				System.out.println("An error occured.");
				e.printStackTrace();
			}
	}}
		

	


