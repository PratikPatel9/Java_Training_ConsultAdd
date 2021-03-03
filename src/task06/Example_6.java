package task06;

public class Example_6 {

	public static void main(String[] args) {
		
		//create an object of a class
		Programming prg = new Programming();
		prg.str = "java";
		
		System.out.println("I Love " + prg.str +".");
		System.out.println(prg.name);

	}

}
class Programming{
	String str;
	String name;
	
	public Programming(String str) {
		name = str;
	}
	
	public Programming() {
		name = "I Love Programming Language. ";
	}
}
