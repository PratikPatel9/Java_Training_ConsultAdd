package task04;

//import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the String + " + );
		String str = "This is A Training class for Java at ConsultADd";
		//String str = sc.nextLine();
		//System.out.println("Enter the String = ");
		
		str = str.replaceAll("\\s", "");
		
		System.out.println(" After remove the spaces : \n \n" + str);
		
		
		
		
	}

}
