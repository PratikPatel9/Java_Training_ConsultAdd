package task04;

import java.util.Scanner;

public class SwapCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thre String : ");
		String str = sc.nextLine();
		char ch;
		//String str = " heLLo WOrLd";
		//StringBuffer sb = new StringBuffer(str);
		
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				System.out.print(Character.toLowerCase(ch));
			else {
				System.out.print(Character.toUpperCase(ch));
			}
		}
	
		
		
	

		//System.out.println("String after case transformation : " +str);

}
}