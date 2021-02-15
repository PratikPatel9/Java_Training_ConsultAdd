import java.util.Scanner;

public class LongDataType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Long Data Type Input : ");
		
		long num = sc.nextLong();
		System.out.println("The sum is "+ sum(num));
		
		}

	private static long sum(long num) {
		long result = 0;
		while (num > 0) {
			result += num %10;
			num /= 10;
		}
		return result;
	}

}
