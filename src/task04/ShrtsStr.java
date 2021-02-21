package task04;

public class ShrtsStr {
	static String arr[] = {"This","is","My","first","string","training" };

	public static void main(String[] args) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j].compareTo(arr[i]) < 0) {
					String st = arr[i];
					arr[i] = arr[j];
					arr[j] = st;
				}
			}
			System.out.println(arr[i]);
		}
		

	}

}
