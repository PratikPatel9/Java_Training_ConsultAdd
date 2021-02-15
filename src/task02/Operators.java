package task02;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First value : ");
		int first = (int) s.nextDouble();
		
		System.out.println("Enter Second value : ");
		int second = (int) s.nextDouble();
		System.out.println("Select any option for calculation from 1,2,3,4,5 . ");
		
	
		int result = s.nextInt();
		
		
		switch (result) {
		case 1 :
			int sum1 = first + second;
			System.out.println(" Addition of two numbers : " + (first + second) );
			if(sum1 < 0) {
				System.out.println("Oops the is returning negative number !!");
			}
			break;
		case 2:
			int sum2 = first - second;
			System.out.println(" Subtraction of two numbers : "+ (first - second));
			if(sum2 < 0) {
				System.out.println("Oops the is returning negative number !!");
			}
			break;
		case 3:
			int sum3 = first * second;
			System.out.println(" Multiplication of two numbers : "+ (first * second));
			if(sum3 < 0) {
				System.out.println("Oops the is returning negative number !!");
			}
			break;
		case 4:
			int sum4 = first / second;
			System.out.println(" Division of two numbers : "+ (first / second));
			if(sum4 < 0) {
				System.out.println("Oops the is returning negative number !!");
			}
			break;
		case 5:
			int sum5 = (first + second)/2;
			System.out.println(" Average of two numbers : "+ ((first + second)/2));
			if(sum5 < 0) {
				System.out.println("Oops the is returning negative number !!");
			}
			break;
		default :
			System.out.println(" You have chosen Invalid Option !!!!!");
		

		
	
		}

		}

	}
	


