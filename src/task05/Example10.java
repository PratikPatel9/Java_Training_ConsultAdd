
package task05;

import java.util.*;
import java.lang.*;


public class Example10 {

	public static void main(String[] args) {
		int[] arr = {1,6,-3,5,7,-9};
		int size = arr.length;
		int i, j, min_sum, sum,min_left_num, min_right_num;
		
		if(size < 2) {
			System.out.println(" Invalid Input ");
			return;
		}
		min_left_num = 0;
		min_right_num = 1;
		min_sum = arr[0] + arr[1];
		
		for(i=0; i< size; i++) {
			for(j = i+1; j<size; j++) {
				sum = arr[i] + arr[j];
				if(Math.abs(min_sum) > Math.abs(sum)) {
					min_sum = sum;
					min_left_num = i;
					min_right_num = j;
				}
			}
		}
		System.out.println("minimum sum for two elements : " + arr[min_left_num] + " and " + arr[min_right_num] );
		

	}

}
