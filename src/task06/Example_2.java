package task06;

public class Example_2 {

	public static void main(String[] args) {
		Employee e1 = new Employee("Robert",1994,40000,"64C - WallStreet");
		Employee e2 = new Employee("Sam",2000,50000,"68D - Walls Streat");
		Employee e3 = new Employee("John",1999,60000,"26B - Walls Streat");
		
		System.out.println("Name \t Year \t Salry \t Address \n");
		
		//getting details of empoyee1
		System.out.println(e1.getName()+"\t "+e1.getYear()+"\t "+e1.getSalary()+"\t "+e1.getAddress()+"\n");
		
		//getting details of employee2
		System.out.println(e2.getName()+"\t "+e2.getSalary()+"\t "+e2.getYear()+"\t "+e2.getAddress()+"\n \n");
		
		//getting details of employee3
		System.out.println(e3.getName()+"\t "+e3.getSalary()+"\t "+e3.getYear()+"\t "+e3.getAddress()+"\n\n\n");
	}

}

class Employee {
	private String name, address;
	private int year, salary;
	
	public Employee(String n, int y, int sal, String add) {
		name = n;
		year = y;
		salary = sal;
		address = add;
	}
	//here, we are setting getter method
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public int getSalary() {
		return salary;
	}
	public String getAddress() {
		return address;
	}
	 
}