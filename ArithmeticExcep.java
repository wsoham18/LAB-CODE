package test;

public class ArithmeticExcep {

	public static void main(String[] args) {
		try {
			int result=10/0;
			System.out.println(result);
		}
       catch(ArithmeticException e) {
    	   System.out.println("Error cannot be divide by zero");
       }
	System.out.println("The program continues...");
	
	}

}
