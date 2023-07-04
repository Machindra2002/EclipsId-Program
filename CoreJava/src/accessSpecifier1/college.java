package accessSpecifier1;

import AccessSpecifier.Student;

public class college extends Student{


	public static void main(String[] args) {
		
		college s = new college();
		System.out.println(s.rno);
//		System.out.println(s.name);//only access for class
		System.out.println(s.qualification);
//		System.out.println(s.marks); // only access for same package
		

	}
}
