package task02;

public class SkipNumbers {

	public static void main(String[] args) {
		for(int i = 0;i < 6; i++) {
			if(i == 3) {
				continue;
			}
			else {
				System.out.println(i + " ");
			}
		}

	}

}
