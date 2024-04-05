package Constructors;

public class TestStudent {

	public static void main(String[] args) {
		
		Student student=new Student();
		System.out.println("Object is created");
		System.out.println(student.studentId);
	
		Student student1=new Student();
		int id=student1.getStudentId();
	    student1.setStudentId(12);
	    int id1=student1.getStudentId();
	    System.out.println(id1);
}
}
