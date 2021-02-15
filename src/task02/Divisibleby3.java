package task02;

import java.util.Scanner;

public class Divisibleby3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		int num = sc.nextInt();
		
		if( (num % 3 == 0) && (num % 5 ==0)) {
			System.out.println("ConsultAdd Java Trining");
		} else if (num % 3 == 0) {
			System.out.println("ConsultAdd");
		} else if(num % 5 == 0) {
			System.out.println("Java Training");
		}
	}
}	

