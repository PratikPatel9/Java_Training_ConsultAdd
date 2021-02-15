package task02;

import java.util.Scanner;

public class ConditionalAction {
	
	public static void main(String[] args)
	   {
	       Scanner sc=new Scanner(System.in);
	       int num;
	      
	       System.out.print("Enter a number: ");
	       num=sc.nextInt();
	       
	       
	       if(num%2 != 0) {
	    	   System.out.println("NEW");
	       } else {
	           if(num >= 2 && num <= 5) {
	    		   System.out.println("OLD");
	    	   }
	    	   else if(num >= 6 && num <= 30) {
	    		   System.out.println("NEW");
	    	   } else {
	    		   System.out.println("OLD");
	       }
	       }
	   }
}
	      
	  
	