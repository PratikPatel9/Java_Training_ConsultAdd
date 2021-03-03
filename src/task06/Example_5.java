package task06;

public class Example_5 {

	public static void main(String[] args) {
		
		//create object of class AddAmount
		AddAmount obj1 = new AddAmount();
		System.out.println("The saving Amount for objetct1: " + obj1.amount);
		
		AddAmount obj2 = new AddAmount(50.00);
		System.out.println("The saving Amount for objetct1: " + obj2.amount);
		
		//Display Total Number of Transaction
		System.out.println("Total Number of Transection is saving box are : "+ AddAmount.numOfTransection);
	}

}
 class AddAmount{
	 double amount = 50.00;
	
	//constructor1 that does not add any amount
	
	public AddAmount() {
		amount = amount+0;
	}
	
	//constructor 2 that does have a parameter with data member
	public AddAmount(double x) {
		amount = amount + x;
	}
	
	//count Numbers of Transaction is done
	static int numOfTransection = 0; {
		numOfTransection = numOfTransection + 1;
		
	}
}
