package rujul;
import java.util.Scanner;
class Area {

	    double area;
	    Area(double r)
	    {
	    	area=(3.14*r*r);
	    }}
		
		class Areaofcircle{
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the radius");
			int rad = s.nextInt();
			Area a = new Area(rad);
			System.out.println("The area is  "+a.area);
			
	}

}
