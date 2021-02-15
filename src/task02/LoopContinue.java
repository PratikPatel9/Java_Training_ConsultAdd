package task02;

import java.util.Scanner;

public class LoopContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter the first number  :  ");
			double i1 = sc.nextDouble();

			System.out.println("Enter the second number : ");
			double i2= sc.nextDouble();

			System.out.println(i1 + " - "+ i2 + " = " + (i1 -i2));

			double sum = (i1-i2);

			if(sum  < 0 ) {
				System.out.println(" Its over !!");
				break; 
			}
				System.out.println(" Good going !!");
				continue;


		} while (true);

	}

}

