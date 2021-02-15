package task02;

import java.util.Scanner;

public class ReadsFloatingNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("####  Enter the Numbers : ");
		double num = sc.nextFloat();
		
		if(num == 0) {
			System.out.println(" ****  Zero ***** ");
		} else if( num > 0) {
			System.out.println(" *** Positive Numbers **** ");
		} else {
			System.out.println(" **** Negative Numbers  ****");
		} 
		if(Math.abs(num)<1){
			System.out.println(" **** Small **** ");
		}else if(Math.abs(num)> 1000000) {
			System.out.println(" ***** Large **** ");
		}

	}

}
