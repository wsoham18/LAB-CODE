package test;
import java.util.Scanner;
public class InputMismatch {
 public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		try{System.out.print("Enter Number:  ");
		int number = r.nextInt();
		System.out.println("Enter the no.:  "+number);
		}
		catch(Exception e) {
		System.out.println("Invalid no. ");
		}
	}
		
}
