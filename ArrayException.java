package test;

public class ArrayException {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		
		try {
			System.out.println(arr[4]);
			}
        catch(Exception e) {
        	System.out.println("The array is out of index");
        }
	}

}
