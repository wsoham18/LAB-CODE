package test;

public class NullPointer {

	public static void main(String[] args) {
		String str=null;
		try {
		System.out.println(str.length());
		}
		catch(Exception e) {
			System.out.println("The String type is null");
		}
	
	
	}
	
		

}
