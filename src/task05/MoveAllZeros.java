package task05;
import java.util.*;
 public class MoveAllZeros {
     public static void main(String[] args) throws Exception {
    	 
        int[] array = {0,0,1,0,3,0,5,0,6};
        int i = 0;
		System.out.print(" Original array: \n ");
		for (int n : array)
            System.out.print(n+"  ");
		
        for(int j = 0, l = array.length; j < l;) {
            if(array[j] == 0)
                j++;
            else {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i ++;
                j ++;
            }
        }
        while (i < array.length)
            array[i++] = 0;
		System.out.print("\n After moving 0's to the end of the array: \n \n");
        for (int n : array)
            System.out.print(n+"  ");
			System.out.print(" \n");
    }
}