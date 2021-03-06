package task07;



public class Example_7 {

	public static void main(String[] args) {
		String str = "AAABBBBBBBBBCDCBDKCKKKKEPPPPPP";
		
		int totalcount = str.length(); //  first we need to find total length of String
		
		int totalcount_afterRemove = str.replace("A", "").length();   //total length after removing a
		int totalcount_afterRemove1 = str.replace("B", "").length();
		int totalcount_afterRemove2 = str.replace("C", "").length();
		int totalcount_afterRemove3 = str.replace("D", "").length();
		int totalcount_afterRemove4 = str.replace("K", "").length();
		int totalcount_afterRemove5= str.replace("E", "").length();
		int totalcount_afterRemove6 = str.replace("P", "").length();
		
		
		
		
		int count = totalcount - totalcount_afterRemove;
		int count1 = totalcount - totalcount_afterRemove1;
		int count2 = totalcount - totalcount_afterRemove2;
		int count3 = totalcount - totalcount_afterRemove3;
		int count4 = totalcount - totalcount_afterRemove4;
		int count5 = totalcount - totalcount_afterRemove5;
		int count6 = totalcount - totalcount_afterRemove6;
		
		
		System.out.println(" Number of Occurance of A is : " + count);
		System.out.println(" Number of Occurance of B is : " + count1);
		System.out.println(" Number of Occurance of C is : " + count2);
		System.out.println(" Number of Occurance of D is : " + count3);
		System.out.println(" Number of Occurance of K is : " + count4);
		System.out.println(" Number of Occurance of E is : " + count5);
		System.out.println(" Number of Occurance of P is : " + count6);
		
	}

}
