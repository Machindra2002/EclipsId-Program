package AccessSpecifier;

public class Employee {

	public int rno = 30;
	private String name = "Machindra";
	protected String qualification = "MCA";
	int marks = 80;

class ChildEmployee extends Employee {
	
	
}

	public static void main(String[] args) {
//		ChildEmployee emp = new ChildEmployee();
//		System.out.println(emp.rno);
////		System.out.println(emp.name);
//		System.out.println(emp.qualification);
//		System.out.println(emp.marks);
	}

}