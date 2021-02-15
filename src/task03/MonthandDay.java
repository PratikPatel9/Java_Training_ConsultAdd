import java.util.Scanner;

public class MonthandDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter The Month Number : ");
				
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
			System.out.println("\n This Month has 31 days !! ");
			break;
		case 2 :
			System.out.println("\n This Month has 28 or 29 days !! ");
			break;
		case 3 :
			System.out.println("\n This Month has 31 days !! ");
			break;
		case 4 :
			System.out.println("\n This Month has 30 days !! ");
			break;
		case 5 :
			System.out.println("\n This Month has 31 days !! ");
			break;
		case 6 :
			System.out.println("\n This Month has 30 days !! ");
			break;
		case 7 :
			System.out.println("\n This Month has 31 days !! ");
			break;
		case 8 :
			System.out.println("\n This Month has 31 days !! ");
			break;
		case 9 :
			System.out.println("\n This Month has 30 days !! ");
			break;
		case 10 :
			System.out.println("\n This Month has 31 days !! ");
			break;
		case 11 :
			System.out.println("\n This Month has 30 days !! ");
			break;
		case 12 :
			System.out.println("\n This Month has 31 days !! ");
			break;
		default :
			System.out.println(" \n You have Entered Ivalid details \n Please Correct it .");
		}
		

	}

}
