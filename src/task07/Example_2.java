/*
 * to find a numbers of words from String
 */

package task07;

public class Example_2 {

	public static void main(String[] args) {
		String str = "Hello ConsultAdd!! Students";
		System.out.println(str + " \n");
		System.out.println("Numbers of words in String is : "+ countString(str));
		

	}

	private static int countString(String str) {
		int count = 0;
		String[] str1 = str.split(" ");
		for(int i =0; i < str1.length; i++ ) {
			count++;
		}
		return count;
	}

}
