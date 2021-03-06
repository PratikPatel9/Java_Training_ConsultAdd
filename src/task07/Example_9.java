package task07;

public class Example_9 {

	public static void main(String[] args) {
		int[] a = {-2,2,10,3,59,39};
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i < a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);

	}

}
