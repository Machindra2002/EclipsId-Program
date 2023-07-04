package mypackage;

import java.util.*;
import model.Student;
import dao.StudentDao;

public class StudentTask {
	StudentDao sdao;

	public StudentTask() {
		sdao = new StudentDao();
	}

	public void AddStudent() {
		Scanner sc = new Scanner(System.in);
		int rno = sdao.TotalStudent() + 1;
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter English Marks");
		float eng = sc.nextFloat();
		System.out.println("Enter Maths marks");
		float math = sc.nextFloat();
		System.out.println("Enter Science marks");
		float sci = sc.nextFloat();

		Student st = new Student(rno, name, eng, math, sci);
		int cnt = sdao.AddStudnets(st);
		System.out.println("Student Add Successfully \n Total Students = " + cnt);
	}

	public void UpdateStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No");
		int rno = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter English marks");
		float eng = sc.nextFloat();
		System.out.println("Enter Maths marks");
		float math = sc.nextFloat();
		System.out.println("Enter Science marks");
		float sci = sc.nextFloat();

		Student st = new Student(rno, name, sci, math, sci);
		sdao.UpdateStudent(st);
		System.out.println("Student Update Successfully ");
	}

	public void DeleteStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No");
		int rno = sc.nextInt();
		sdao.DeleteStudent(rno);
		System.out.println("Student Deleted Successfully");
	}

	public void GetStudentByRo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No");
		int rno = sc.nextInt();
		Student s = sdao.GetStudent(rno);
		System.out.println(
				s.getRno() + " " + s.getName() + " " + s.getEnglish() + " " + s.getMaths() + " " + s.getScience());
	}

	public void GetAllStudent() {
		List<Student> lst = sdao.GetStudent();
		for (Student s : lst) {
			System.out.println(
					s.getRno() + " " + s.getName() + " " + s.getEnglish() + " " + s.getMaths() + " " + s.getScience());
		}
	}

	public static void main(String[] args) {

		StudentTask s = new StudentTask();
		int i = 1;
		while (i != 0) {
			System.out.println(
					"Enter Your Choice\n1.Add Student\n2.Display All Student\n3.Get Student By Roll No\n4.Update Student\n5.Delete Student\n");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				s.AddStudent();
				break;
			}
			case 2: {
				s.GetAllStudent();
				break;
			}
			case 3: {
				s.GetStudentByRo();
				break;
			}
			case 4: {
				s.UpdateStudent();
				break;

			}
			case 5: {
				s.DeleteStudent();
				break;
			}
			default: {
				System.out.println("Please Enter Your Correct Choice");
				break;
			}
			}
			System.out.println("Do You want to continue? Yes(1)/No(0)");
			i = sc.nextInt();
		}
	}
}
