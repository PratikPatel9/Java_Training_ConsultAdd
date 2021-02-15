import java.util.Scanner;

public class NumberOrderCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number : ");
		long num1 = sc.nextLong();
		System.out.println("Enter second Number : ");
		long num2 = sc.nextLong();
		System.out.println("Enter the Third Number :");
		long num3 = sc.nextLong();
		
		if (num1 < num2 && num2 < num3 ){
			System.out.println(" INCREASING ");
		} else if( num1 > num2 && num2 > num3) {
			System.out.println("  DECREASING  ");
		} else {
			System.out.println("Neither increasing or decreasing order");
		}

	}

}
