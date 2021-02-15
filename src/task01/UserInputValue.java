package Task1;

import java.util.Scanner;

public class UserInputValue {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first Value : ");
		int x = s.nextInt();
		
		System.out.println("Enter the second value : ");
		int y = s.nextInt();
		
		System.out.println("Enter the Third Value : ");
		int z = s.nextInt();
		
		int a = x + y + z;
		
		System.out.println("Result : " + a);
	}

}
