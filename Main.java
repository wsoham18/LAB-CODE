package test;

abstract class Calculator {
abstract int add(int a, int b);
abstract int sub(int a, int b);
abstract int multiply(int a, int b);
abstract int division(int a, int b);
}

class Calculations extends Calculator{
	
	int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	int sub(int a, int b) {
		int difference = a-b;
		return difference;
	}
	
	int multiply(int a, int b) {
		int product = a*b;
		return product;
	}
	
	int division(int a ,int b) {
		int divide = a/b;
		return divide;
	}
}


public class Main{
	public static void main(String args[]) {
		
		Calculations S1=new Calculations();
		Calculations S2=new Calculations();
		Calculations S3=new Calculations();
		Calculations S4=new Calculations();
		
		int result1= S1.add(5,4);
		int result2= S2.sub(9,3);
		int result3= S3.multiply(6,7);
		int result4= S4.division(36,9);
		
		System.out.println("The sum of two no. is: "+result1);
		System.out.println("The difference of two no. is: "+result2);
		System.out.println("The product of two no. is: "+result3);
		System.out.println("The divide of two no. is: "+result4);
		
		
		
	}
}