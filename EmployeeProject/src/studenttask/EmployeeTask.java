package studenttask;
import model.Employee;
import employeedao.EmployeeDao;
import java.util.*;

public class EmployeeTask {
	
	EmployeeDao edao;
	
	public EmployeeTask() {
		edao = new EmployeeDao(); 
	}
	
	public void AddEmployee() {
		Scanner sc = new Scanner(System.in);
		int eid = edao.TotalEmployee() + 1;
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter Designation");
		String des = sc.next();
		System.out.println("Enter Salary");
		float sal = sc.nextFloat();
		
		Employee e = new Employee(eid,name,des,sal);
		int cnt = edao.AddEmployee(e);
		System.out.println("Employee add successfully\nTotal Employee=" +cnt);
		System.out.println("**************************************************");
	}
	
	public void UpdateEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int eid = sc.nextInt();
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter Designation");
		String des = sc.next();
		System.out.println("Enter Salary");
		float sal = sc.nextFloat();
		
		Employee e = new Employee(eid,name,des,sal);
		edao.UpdateEmployee(e);
		System.out.println("Employee Updated Successfully");
		System.out.println("**************************************************");
	}
	
	public void DeleteEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int eid = sc.nextInt();
		edao.DeleteEmployee(eid);
		System.out.println("Employee Delete Successfully");
		System.out.println("**************************************************");
	}
	
	public void GetAllEmployee() {
		List<Employee> ee = edao.GetEmployee();
		for(Employee e : ee) {
		System.out.println(e.getEid() + " "+e.getName() + " "+e.getDes() + " "+e.getSalary());
		}
		System.out.println("All Employee Data Access Successfully");
		System.out.println("**************************************************");
	}

	public void GetEmployeeByEid() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int eid = sc.nextInt();
		Employee e = edao.GetEmployee(eid);
		System.out.println(e.getEid() + " "+e.getName() + " "+e.getDes() + " "+e.getSalary());
		System.out.println("Employee Data Access By Rno  Successfully");
		System.out.println("**************************************************");
	}
	public static void main(String[] args) {
		
		EmployeeTask e = new EmployeeTask();
		int i=1 ;
		while(i != 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.AddEmployee\n2.GetAllEmployee\n3.GetEmployeeByRno\n4.UpdateEmployee\n5.DeleteEmployee");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:{
				e.AddEmployee();
				break;
			}
			case 2:{
				e.GetAllEmployee();
				break;
			}
			case 3:{
				e.GetEmployeeByEid();
				break;
			}
			case 4:{
				e.UpdateEmployee();
				break;
			}
			case 5:{
				e.DeleteEmployee();
				break;
			}
			default:{
				System.out.println("Please Enter Correct Choice");
			}
			}
			
			System.out.println("Do you want to continue?press\nYes(1)/No(0)"); 
			ch = sc.nextInt();
		}

	}

}
