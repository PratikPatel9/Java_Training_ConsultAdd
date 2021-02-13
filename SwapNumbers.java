package Task1;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		//System.out.println("Enter the First Value : ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Value : ");
		int x = sc.nextInt();
		
		System.out.println("Enter the second value : ");
		int y = sc.nextInt();
		
		System.out.println("The value before swapping :" + x + " " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("The value after swapping  : "+ x + " " + y);

	}

}
