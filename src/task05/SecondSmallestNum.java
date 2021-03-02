package task05;

public class SecondSmallestNum {

	public static void main(String[] args) {
		int[] a= {44,66,77,9,48,89,103,4,3,7};
		
		System.out.println("Print Second Smallest Element in array : " + getSmallestElement(a,10));

	}

	public static int getSmallestElement(int[] a, int total) {
		int temp;
		for(int i = 0; i < total; i++) {
			for(int j = i+1; j < total; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a[1];
	}

}
