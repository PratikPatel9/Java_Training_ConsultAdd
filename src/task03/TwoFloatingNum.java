import java.util.Scanner;

public class TwoFloatingNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  first number : ");
		double first = sc.nextDouble();
		System.out.println("Enter the  second number : ");
		double second = sc.nextDouble();
		
		if(Math.abs(first - second) <= 0.01 ) {
			System.out.println("These numbers are same. ");
		} else {
			System.out.println("These Numbers are NOT same. ");
		}

	}

}
