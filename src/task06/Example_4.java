package task06;

public class Example_4 {

	public static void main(String[] args) {
		
		// creating an object for each new constructor with asked parameters
		
		Rectangle r1 = new Rectangle();   //object with no parameter 
		System.out.println("Area of r1: " + r1.area() + "\n");  
		
		Rectangle r2 = new Rectangle(30,30); //Object with two parameters
		System.out.println("Area of r2: " + r2.area() + "\n");
		
		Rectangle r3 = new Rectangle(16);   // Object with one parameter
		System.out.println("Area of r3: " + r3.area() + "\n");
	}

}
class Rectangle {
	
	private int length;
	private int breadth;
	
	// create a method which calculate the area
		int area() {
			return length * breadth;
		}
	
	//constructor 1 with no Parameter
	Rectangle() {
		this.length  = 10;  	//predicting default length zero
		this.breadth = 10; 	//predicting default length zero
	}
	
	//constructor 2 with 2 parameters
	Rectangle(int length, int breadth) {
		this.length  = length;
		this.breadth = breadth;
	}
	
	//Constructor 3 with 1 parameters
	Rectangle(int length) {
		this.length  = length;
		this.breadth = length;
	}
	
	
}
