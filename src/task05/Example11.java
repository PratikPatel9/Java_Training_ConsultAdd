package task05;

import java.util.Arrays;

public class Example11 {

	public static void main(String[] args) {
		int nums[] = {10,20,30,40,50,60,70,80,90,100};
		int result[];
		
		System.out.println("Original Array : \n ");
		System.out.println(Arrays.toString(nums));
		
		result = rearrange(nums,nums.length);
		
		System.out.println(" New Array  \n");
		System.out.println(Arrays.toString(result));

	}

	static int[] rearrange(int[] new_nums, int n) {
		 int temp[] = new int[n];
		 
		 int small_num = 0;
		 int large_num = n - 1;
		 boolean flag = true;
		 
		 for(int i = 0; i < n; i++) {
			 if(flag)
				 temp[i] = new_nums[large_num--];
			 else
				 temp[i] = new_nums[small_num++];
			 
			 flag = !flag;
						 
						 
		 }
		
		return temp;
	}

}
