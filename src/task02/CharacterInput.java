package task02;

import java.util.Scanner;

public class CharacterInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valid Character : ");
		char ch = sc.next().charAt(0);
		if(ch == 'r' || ch == 'R'|| ch == 'a' || ch == 'A' || ch == 'n' || ch == 'N' || ch == 'd' || ch == 'D' || ch == 'o' || ch == 'O' || ch == 'm' || ch == 'M') {
			System.out.println("FOUND");
		} else {
			System.out.println("NOT FOUND");
		}

	}

}
