/*
 * reverse the String
 */
package task07;

public class Example_1 {

	

	public static void main(String[] args) {
		
		String str = "I am a Software Engineer since 2020";
		System.out.println(reverseString(str));
	}

	private static String reverseString(String str) {
		
		String reverseString = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
			
		}
		return reverseString;
	}

}
