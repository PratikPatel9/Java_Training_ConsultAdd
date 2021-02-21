package task04;

import java.util.Scanner;

public class ReversetheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		char[] str = sc.nextLine().toCharArray();
		
		System.out.println("\n Reverse String is : ");
		for(int i = str.length -1; i>=0; i--) {
			System.out.print(str[i]);
		}
		System.out.println("\n");
		

	}

}
