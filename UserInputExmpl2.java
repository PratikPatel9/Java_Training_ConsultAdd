package Task1;

import java.util.Scanner;

public class UserInputExmpl2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println(" Enter the first number : ");
		int x = sc.nextInt();
		
		System.out.println("Enter the second value : ");
		int y = sc.nextInt();
		
		//total sum of two variable
		int z = x + y;
		
		// adding 30 into result of 2 numbers
		
		z = z + 30;
		
		System.out.println("Total = " + z);
	}

}
