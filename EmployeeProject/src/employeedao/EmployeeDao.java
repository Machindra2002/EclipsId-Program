package employeedao;
import model.Employee;
import java.util.*;

public class EmployeeDao {
	
	List<Employee> lemp = new ArrayList<>();
	
	public int AddEmployee(Employee e) {
		lemp.add(e);
		return lemp.size();
	}
	
	public int TotalEmployee() {
		return lemp.size();
	}

	public List<Employee> GetEmployee(){
		return lemp;
	}
	
	public Employee GetEmployee(int eid) {
		Employee e = null;
		for(Employee ee:lemp) {
			if(ee.getEid() == eid) {
				e = ee;
				break;
			}
		}
		return e;
	}
	
	public void UpdateEmployee(Employee e) {
		Employee ee = GetEmployee(e.getEid());
		int i = lemp.indexOf(ee);
		lemp.set(i, e);
	}
	
	public void DeleteEmployee(int eid) {
		Employee ee = GetEmployee(eid);
		int i = lemp.indexOf(ee);
		lemp.remove(i);
	}
}
