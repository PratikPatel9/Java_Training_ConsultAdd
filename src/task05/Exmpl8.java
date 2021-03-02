package task05;

public class Exmpl8 {

	public static void main(String[] args) {
		 int[] arr = {4,4,6,2,6,6,7,7,1,7,7};
		 
		 System.out.println("This is an Original Array length: \n  " + arr.length);
		 System.out.println("Array elements are : \n");
		 
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i]+ " ");
		 }
		 System.out.println(" The length of An Array is:  \n  "+ arry_sort(arr));
		 
	}
	public static int arry_sort(int[] nums) {
		int index = 1;
		for(int i =1; i < nums.length; i++) {
			if(nums[i] != nums[index-1])
				nums[index++] = nums[i];
		}
		return index;
	}

}
