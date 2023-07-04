package main;
import basic.Student;
import StudentDao.StudentDao;
import java.util.*;

public class StudentMainMethod {
	
	StudentDao sdao;
	public StudentMainMethod() {
		sdao = new StudentDao();
	}
	
	public void AddStudent() {
		Scanner sc = new Scanner(System.in);
		int rno = sdao.TotalStudent() + 1;
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Subject1 Marks");
		float m1 = sc.nextFloat();
		System.out.println("Enter Subject2 Marks");
		float m2 = sc.nextFloat();
		System.out.println("Enter Subject3 Marks");
		float m3 = sc.nextFloat();
		
		Student st = new Student(rno,name,m1,m2,m3);
		int cnt = sdao.AddStudent(st);
		System.out.println("Student Add Sccessfully\n Total Student " +cnt);
		System.out.println("************************************************");
	}
	
	public void UpdateStudent() {
		Scanner sc = new Scanner(System.in);
		int rno = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Subject1 Marks");
		float m1 = sc.nextFloat();
		System.out.println("Enter Subject2 Marks");
		float m2 = sc.nextFloat();
		System.out.println("Enter Subject3 Marks");
		float m3 = sc.nextFloat();
		
		Student st = new Student(rno,name,m1,m2,m3);
		sdao.UpdateStudent(st);
		System.out.println("Student Update Sccessfully ");
		System.out.println("************************************************");
	}
	
	public void DeleteStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No");
		int rno = sc.nextInt();
		sdao.DeleteStudent(rno);
		System.out.println("Delete Student Successfully");
		System.out.println("************************************************");
	}
	
	public void GetStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No");
		int rno = sc.nextInt();
		Student s = sdao.GetStudent(rno);
		System.out.println(s.getRno()+" "+s.getName()+" "+s.getM1()+" "+s.getM2()+" "+s.getM3());
		System.out.println("************************************************");
	}
	
	public void GetAllStudent() {
		List<Student> lst = sdao.GetStudent();
		for(Student s: lst) {
			System.out.println(s.getRno()+" "+s.getName()+" "+s.getM1()+" "+s.getM2()+" "+s.getM3());
		}
		System.out.println("************************************************");
	}

	public static void main(String[] args) {
		
		StudentMainMethod s = new StudentMainMethod();
		int i = 1;
		while(i != 0) {
			System.out.println("1.AddStudent\n2.UpdateStudent\n3.GetAllStudent\n4.GetStudentByRno\n5.DeleteStudent");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice No");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:{
				s.AddStudent();
				break;
			}
			case 2:{
				s.UpdateStudent();
				break;
			}
			case 3:{
				s.GetAllStudent();
				break;
			}
			case 4:{
				s.GetStudent();
				break;
			}
			case 5:{
				s.DeleteStudent();
				break;
			}
			default:{
				System.out.println("Please enter correct choice");
			}
			}
			System.out.println("Do you want to continue? Yes(1)/No(0)");
			ch=sc.nextInt();
		}
	}
}
