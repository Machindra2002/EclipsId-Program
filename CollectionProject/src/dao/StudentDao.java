package dao;

import java.util.*;

import model.Student;

public class StudentDao {

	public static List<Student>lststudents=new ArrayList<>();

	public int AddStudnets(Student st) {
		lststudents.add(st);
		return lststudents.size();
	}

	public int TotalStudent() {
		return lststudents.size();
	}

	public List<Student> GetStudent() {
		return lststudents;
	}

	public Student GetStudent(int rno) {
		Student st = null;
		for (Student s : lststudents) {
			if (s.getRno() == rno) {
				st = s;
				break;
			}
		}
		return st;
	}

	public void UpdateStudent(Student st) {
		Student s=GetStudent(st.getRno());
		int i=lststudents.indexOf(s);
	    lststudents.set(i, st);
	}

	public void DeleteStudent(int rno) {
		Student s = GetStudent(rno);
		int i = lststudents.indexOf(s);
		lststudents.remove(i);

	}

}
