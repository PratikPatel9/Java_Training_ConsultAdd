package task05;

import java.util.Arrays;

public class Exmpl7 {

	public static void main(String[] args) {
		int[] arr = {4,3,5,9,10};
		
		System.out.println("Original Array:     " + Arrays.toString(arr));
		int max_value = arr[0];
		int min_value = arr[0];
		
		for(int i=1; i < arr.length; i++) {
			if(arr[i] > max_value)
				max_value = arr[i];
			if(arr[i] < min_value)
				min_value = arr[i];
		}
		System.out.println("Difference the Largest and Smallest Value : "+ (max_value - min_value));

	}

}
