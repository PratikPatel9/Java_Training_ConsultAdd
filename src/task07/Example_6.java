package task07;

import java.util.Scanner;

public class Example_6 {

	public static void main(String[] args) {
		int num, n, temp,total = 0;
		System.out.println("Enter 3 digit number to check Armstrong or not:  \n");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		sc.close();
		n = num;
		
		for(; n != 0; n /= 10) {
			temp = n % 10;
			total = total + temp*temp*temp;
		}
		if(total == num)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " is not an Armstrong number");
		
		
		
		
		
		
//		int x = 0 ,a,temp;
//		int n = 227; // we are checking this number is Armstrong number or not.
//		temp = n;
//		while(n > 0) {
//			a = n%10;
//			n = n/10;
//			x = x + (a * a * a);
//		}
//		if(temp == x)
//			System.out.println("  This is Armstrong number. ");
//		else
//			System.out.println("This is not Armstrong number. ");

	}

}
