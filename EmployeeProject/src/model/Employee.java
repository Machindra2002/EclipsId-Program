package model;

public class Employee {

	private int eid;
	private String name;
	private String des;
	private float salary;

	Employee() {
		super();
	}

	public Employee(int eid, String name, String des, float salary) {
		this.eid = eid;
		this.name = name;
		this.des = des;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
