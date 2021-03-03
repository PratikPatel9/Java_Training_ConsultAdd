/*
 * Java Program for adding and subtracting two complex numbers
 */
package task06;

import java.lang.*;

class calc {
	
	
	float real, imaginary;
	
	calc() {
		//do nothing constructor
	}
	
	
	// we need constructor after creating object in main method
	calc(float r, float i){
		
		real = r;
		imaginary = i;
	}


	void display() {
		System.out.println(real + "+ " + imaginary+"i");
		
	}

//
//	 calc add(calc c2) {
//		calc result = new calc();
//		
//		result.real = real + c2.real;
//		result.imaginary = imaginary + c2.imaginary;
//		
//		return (result);
//		
//	}


	 calc sub(calc c2) {
		calc result = new calc();
		result.real = real - c2.real;
		result.imaginary = imaginary - c2.imaginary;
		return (result);
	}
}


class ComlexNumber_1 {

	public static void main(String[] args) {
		// first we need to create two objects
		calc c1 = new calc(12.5f,4.6f);
		calc c2 = new calc(10.4f,5.5f);
		
		//display the numbers
		c1.display();
		c2.display();
		
		//creating new object 
		calc c3 = new calc();
		
//		//for adition
//		c3 = c1.add(c2);
//		c3.display();
//		
		//for subtraction
		c3 = c1.sub(c2);
		c3.display();
		
		

	}

}


	
