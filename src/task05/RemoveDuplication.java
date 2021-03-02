package task05;

import java.util.Arrays;

public class RemoveDuplication {

	public static void main(String[] args) {
		int arr[] =  new int[] {20,20,30,30,10,90,80,80,50,40,50};
		
		Arrays.sort(arr);
		System.out.println("Sorted Elements in array : \n" +Arrays.toString(arr));
		
	}
	public static void removeDuplication(int[] arr) {
		
		int unique_arr = arr.length;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = arr[ unique_arr-1];
				}
				 unique_arr--;
				 j--;
					
			}
			
		}
		System.out.println(arr.length);
	}
}	