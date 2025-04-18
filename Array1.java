package test;

public class Array1 {
	
	public static void main(String args[]) {
		
		int i, sum=0;
		int arr[]= new int[] {1,2,3,4,5};
		for (i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}	
		System.out.println(sum);
	}

}
