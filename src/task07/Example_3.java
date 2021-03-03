package task07;

public class Example_3 {

	public static void main(String[] args) {
		String arr1[] = {"Pratik","Aneri","Jalp","xyz","abc"};
		String arr2[] = {"xyz","sdf","ghy","Pratik","ert","uio"};
		System.out.println("Intersection of two Arrays : \n");
		
		for(int i=0; i < arr1.length; i++) {
			for(int j=0; j <arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
		}
	}

}
