import java.util.Scanner;

public class AverageValues {

	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to get average values : ");
		
		double num = 0;
		double x = 1;
		double n = sc.nextDouble();
		
		while(x <= n) {
			System.out.println("Input Numbers "+ (int)x + ":");
			num += sc.nextDouble();
			x+=1;
		}
		double avg = (num/n);
		
		System.out.println("Average of total number is :" + avg);
		 
	}
}
	