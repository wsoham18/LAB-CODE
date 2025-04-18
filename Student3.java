package test;

public class Student3 {
	int id;
	String name;
	
	void insert_record(int x,String n) {
		rollno=x;
		name=n;
	}

	void displayinformatuin(){
		System.out.println(rollno+"    "+name);
	}
	class Method{
		
	public static void main(String[] args) {
	Student3 S1=new Student3();
	Student3 S2=new Student3();
    S1.insert_record(38, "Rujul");
    S1.insert_record(52, "Yash");
    S1.displayinformatuin();
    S2.displayinformatuin();
	}

}
