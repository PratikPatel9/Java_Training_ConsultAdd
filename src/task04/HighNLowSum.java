package task04;

public class HighNLowSum {

	public static void main(String[] args) {
		
		int [] num = { 2,5,3,1,8,19,7};
		int high = num[0];
		int low = num[0];
		int sum = 0;
		for(int i = 0; i < num.length; i++) {

			if(num[i] != low && num[i] != high) 
				sum += num[i];
		}
	
		
		System.out.println("High value is : "+ high);
		System.out.println("Low value is : " + low);

	
		int avg = sum/(int)(num.length - 2);
	}
	
}

// How to skip the numbers ??
// how to find a sum?