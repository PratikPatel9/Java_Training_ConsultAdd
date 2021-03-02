package task05;

import java.util.Scanner;

public class AddTwoMetrics {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of rows :");
		int i = sc.nextInt();
		System.out.println("Input number of columns: ");
		int j = sc.nextInt();
		
		int arr1[][] = new int[i][j];
		int arr2[][] = new int[i][j];
		int sum[][] = new int[i][j];
		
		System.out.println("Input the elements of first Matrix");
		
		for(int m=0; m<i; m++) 
			for(int n=0;n<j; n++)
				arr1[m][n] = sc.nextInt();
		
		System.out.println("Input the element of second Matrix ");
		
		for(int m=0; m <= i; m++) 
			for(int n=0;n <= j; n++)
				arr2[m][n] = sc.nextInt();
		
		for(int m=0; m<=i; m++) 
			for(int n=0;n<=j; n++)
				sum[m][n] = arr1[m][n] + arr2[m][n];
		
		System.out.println("Sum of Matrix: ");
		
		for(int m=0; m<=i; i++) {
			for(int n=0;n<=j;j++) {
				System.out.println(sum[m][n]+"\t");
				System.out.println();
			}
		}

		

	}

}
