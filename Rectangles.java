package text;
 class Box {
	double length;
	double width;
	void area() {
		System.out.println("Area is");
		System.out.println(length*width);
	}
	
}

public class Rectangles {

	public static void main(String[] args) {
	Box r1=new Box();
	r1.area();
	

	}

}
