package task02;

import java.util.Scanner;

public class FlowChart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		*/
		
		System.out.println("Enter the first number : ");
		int i1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int i2 = sc.nextInt();
		System.out.println("Enter the Third number : ");
		int i3 = sc.nextInt();
		
		float avg= (i1 + i2 + i3)/3;
		System.out.println(" Average of the numbers is : " + avg);
		
		if(avg > i1 && avg > i2 && avg > i3) {
			System.out.println(" The Average is higher than i1, i2, i3. ");
			
		} else if(avg > i1 && avg > i2) {
			System.out.println(" The Average is higher than i1 and i2. ");
			
		} else if (avg > i1 && avg >i3) {
			System.out.println(" The Average is higher than i1 and i3. ");
			
		} else if(avg > i2 && avg >i3) {
			System.out.println(" The Average is higher than i2 and i3. ");
			
		} else if(avg > i1) {
			System.out.println(" The Average is just higher than i1. ");
			
		} else if(avg > i2 ) {
			System.out.println(" The Average is just higher than i2. ");
			
		} else if(avg > i3) {
			System.out.println(" The Average is just higher than i3. ");
		}
	}
}
		



