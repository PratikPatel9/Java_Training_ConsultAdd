import java.util.Scanner;

public class AverageValue2 {

	public static void main(String[] args) {
		double num = 0;
		double x = 1;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("total number of average : ");
		 double n = sc.nextDouble();
		 
		 while(x <= n) {
			 System.out.println("Numbers " + (int) x + ":");
			 num+= sc.nextDouble();
			 x+=1;
		 }
		 double avg = (num/n);
		 System.out.println("average :"+ avg);

	}

}
