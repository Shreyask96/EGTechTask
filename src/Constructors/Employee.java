package Constructors;

public class Employee {
	private int id;
	private String empName;
	private static int count; 
	
	public Employee(int id, String empName) {
		this.id=id;
		this.empName=empName;
		count++;
	}

	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public static void main(String[] args) {
		
		Employee employee0=new Employee(1, "Rahul");
		Employee employee1=new Employee(2, "Virat");
		Employee employee2=new Employee(3, "Harsh");
		Employee employee3=new Employee(4, "Nikhil");
		Employee employee4=new Employee(5, "Praveen");
		
		System.out.println("No of objects created " + Employee.getCount());
		
		
	}

}
