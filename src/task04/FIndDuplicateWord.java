package task04;

//import java.util.Scanner;

public class FIndDuplicateWord {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the String : \n");
		//char s1[] = sc.toString();
		String str = " GoodNight Friends ";
		int count;
		
		char s1[] = str.toCharArray();
		System.out.println("This is Duplicate Characters : ");
		
		// to count each character in the string
		
		for(int i = 0; i < s1.length; i++) {
			count =1;
			for(int j = i+1; j<s1.length; j++) {
				if(s1[i] == s1[j] && s1[i] != ' ') {
					count++; 
					s1[j] ='0';
				}
			}
			if(count > 1 && s1[i] != '0') 
				System.out.println(s1[i]);
			
		}

	}

}
