import java.util.Scanner;

public class MonthDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month Number : ");
		int month = sc.nextInt();
		DaysinMonth(month);
		
	}

	private static void DaysinMonth(int month) {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(" This Month has 31 days. \n");
		} else if( month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("This month has 30 days. \n");
		} else if (month == 2) {
			System.out.println("This Month(February) has 28 or 29 days only.\n ");
		} else {
			System.out.println(" You have entered Invalid details !! \n Please choose Valid Numbers from 1 to 12. \n");
		}
			
		
		
	}

}
