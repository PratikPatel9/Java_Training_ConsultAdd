package task04;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int a1[] = {23,25,75,87,47,1,91,51,2};
		int a2[] = {22,44,64,76,98,12,43,54,90};
		
		System.out.println("To find even Numbers from Odd numbers : ");
		for(int i = 0; i < a1.length; i++) {
			if(a1[i]%2 == 0) {
				System.out.println(a1[i]);
			}
		}
		System.out.println("To find Odd Numbers from Even numbers : ");
		for(int i = 0; i < a2.length; i++) {
			if(a2[i]%2 != 0) {
				System.out.println(a2[i]);
			}
		}
		
		
		
		
		
		
		//int sum =0;
		/*
		for(int  i = 0; i <= a.length-1;i++) {
			sum = sum+a[i];
			
		}
		*/
		
		//Enhanced for loop
		//for( int value:a) {
		//	sum += value;
			
		//}
		//System.out.println(" Sum of an Array : " + sum);

	}

}
