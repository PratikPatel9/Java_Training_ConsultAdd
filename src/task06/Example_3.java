package task06;

public class Example_3 {

	public static void main(String[] args) {
		Student s1 = new Student("abc");
		Student s2 = new Student();
		
		System.out.println(s1.name);
		System.out.println(s2.name);
	}

}

class Student{
	String name;
	
	//here is Overriding method is used for Student method
	public Student(String s1) {
		name = s1;
	}
	public Student() {
		name = "Unknown";
	}
}
