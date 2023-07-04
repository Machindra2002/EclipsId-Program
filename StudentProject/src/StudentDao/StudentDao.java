package StudentDao;

import basic.Student;
import java.util.*;

public class StudentDao {

	List<Student> lStudent = new ArrayList<>();
	
	public int AddStudent(Student st) {
		lStudent.add(st);
		return lStudent.size();
	}
	
	public int TotalStudent() {
		return lStudent.size();
	}
	
	public List<Student> GetStudent() {
		return lStudent;
	}

	public Student GetStudent(int rno) {
		Student st = null;
		for(Student s : lStudent) {
			if(s.getRno() == rno ) {
				st = s;
				break;
			}
		}
		return st;
	}
	
	public void UpdateStudent(Student st) {
		Student s = GetStudent(st.getRno());
		int i = lStudent.indexOf(s);
		lStudent.set(i, st);
		
	}
	
	public void DeleteStudent(int rno) {
		Student s = GetStudent(rno);
		int i = lStudent.indexOf(s);
		lStudent.remove(i);
	}
}
