import java.util.Scanner;

public class FindDaysInMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a month : ");
		int month = sc.nextInt();
		System.out.println("Input a year : ");
		int year = sc.nextInt();
		
		int numOfDays = 0;
		String nameOfMonth = "Unknown";
		
		switch(month) {
		case 1 :
			nameOfMonth = "January";
			numOfDays = 31;
			break;
		case 2 :
			nameOfMonth = "February";
			if((year % 400 == 0) || (year % 4 == 0) &&  (year % 100 != 0)) {
				numOfDays = 29;
			} else {
				numOfDays = 28;
			}
			break;
		case 3 :
			nameOfMonth = "March";
			numOfDays = 31;
			break;
		case 4 :
			nameOfMonth = "April";
			numOfDays = 3;
			break;
		case 5 :
			nameOfMonth = "May";
			numOfDays = 31;
			break;
		case 6 :
			nameOfMonth = "Jun";
			numOfDays = 30;
			break;
		case 7 :
			nameOfMonth = "July";
			numOfDays = 31;
			break;
		case 8:
			nameOfMonth = "August";
			numOfDays = 31;
			break;
		case 9 :
			nameOfMonth = "Septmber";
			numOfDays = 30;
			break;
		case 10 :
			nameOfMonth = "October";
			numOfDays = 31;
			break;
		case 11 :
			nameOfMonth = "November";
			numOfDays = 30;
			break;
		case 12 :
			nameOfMonth = "December";
			numOfDays = 31;
			break;
		default :
			System.out.println("Invalid Entry !!");
			
		}
		System.out.println(nameOfMonth + " "+ year+ " has "+ numOfDays + " days \n");

	}

}
