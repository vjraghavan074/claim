package oops.pkg;

public class Display {

	public static void main(String[] args) {
		
		System.out.println("The Student Details are:\n");
		display();

	}
	
	public static void display() {
		
		Student object = new Student();
		
		System.out.println("Student roll no:" + object.rollNO);
		System.out.println("Student Name:" + object.name);
		System.out.println("Student Department:" + object.dept);
	}

}
