package task05;
import java.util.*;


public class SecondLargetsNum {
	public static int getSecondLargest(int[] a, int total) {
		int temp;
		for(int i =0; i < total;i++) {
			for(int j=i+1; j<total; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total-2];
	}

	public static void main(String[] args) {
		int a[] = {1,2,5,8,6,10};
		int b[] = {44,66,77,9,48,89,103,4,3,7};
		System.out.println("Second largest Number: "+ getSecondLargest(a,6));
		System.out.println("SecondLargest Number: "+ getSecondLargest(b,10));

	}

	

}
