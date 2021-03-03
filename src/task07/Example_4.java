package task07;

import java.util.Arrays;

public class Example_4 {

	public static void main(String[] args) {
		String str = "abcchgjdddflgjbc";
		System.out.println("Original String : \n"+ str +"\n");
		System.out.println("String with Unique characters: " + unique_st(str));

	}

	public static boolean unique_st(String str) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		for(int i =1; i<str.length(); i++) {
			if(ch[i] == ch[i-1]) {
				return false;
			}
		}
		
		return true;
	}

}
