package test;


import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		
         Scanner inp= new Scanner (System.in);
         System.out.println("Enter the size of array");
         int n = inp.nextInt();
         int i, sum=0;
         
         int arr[] = new int[n];
         
         for (i=0;i<n;i++)
         {
        	 System.out.println("  "+i+"  ");
        	 arr[i] = inp.nextInt();
         }
         
         for (i=0;i<n;i++)
         {
        	 System.out.println(arr[i]);
        	 sum=sum+arr[i];
         }
         System.out.println(sum);
	}

}

