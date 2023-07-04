package mypackage;

import java.sql.*;
import java.util.*;

public class DatabaseWork {

	public void Display() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from students1");
			while (rs.next()) {
				int rno = rs.getInt("rollno");
				String name = rs.getString("name");
				String qual = rs.getString("qualification");
				int per = rs.getInt("pecentage");

				System.out.println(rno + " " + name + " " + qual + " " + per);
			}
		} catch (Exception e) {
			System.out.println("Exception=" + e.getMessage());
		}
	}

	public void AddStudent() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			Statement st = con.createStatement();
			int cnt = st.executeUpdate("insert into students1 values(5,'Mandar','BCS',81)");
			if (cnt > 0) {
				System.out.println("Student Add Successfully");
			} else {
				System.out.println("Error!!!");
			}
			// not if else condition is put then also run code only,
			// [st.executeUpdate("insert into students1 values(3,'Suraj','BCS',85)");]this
			// statement is write.
		} catch (Exception ex) {
			System.out.println("Exception=" + ex);
		}
	}

	public void AddStudentByUser() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Roll No");
			int r = sc.nextInt();
			System.out.println("Enter Student Name");
			String n = sc.next();
			System.out.println("Enter Student Qualification");
			String q = sc.next();
			System.out.println("Enter Percentage");
			int p = sc.nextInt();
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			Statement st = con.createStatement();
			int cnt = st.executeUpdate("insert into students1 values(" + r + ", '" + n + "', '" + q + "'," + p + ")");
			if (cnt > 0) {
				System.out.println("Student Add Successfully");
			} else {
				System.out.println("Error!!!");
			}
		} catch (Exception ex) {
			System.out.println("Exception" + ex.getMessage());
		}
	}

	public void UpdateStudent() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Roll No");
			int r = sc.nextInt();
			System.out.println("Enter Student Name");
			String n = sc.next();
			System.out.println("Enter Student Qualification");
			String q = sc.next();
			System.out.println("Enter Percentage");
			int p = sc.nextInt();

			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			Statement st = con.createStatement();
			int cnt = st.executeUpdate("update students1 set name ='" + n + "', qualification='" + q + "',pecentage="
					+ p + "where rollno=" + r);
			if (cnt > 0) {
				System.out.println("Student Update Successfully");
			} else {
				System.out.println("Error!!!");
			}
		} catch (Exception ex) {
			System.out.println("Exception" + ex.getMessage());
		}
	}

	public void DeleteStudent() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Roll No");
			int r = sc.nextInt();
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			Statement st = con.createStatement();
			int cnt = st.executeUpdate("delete students1 where rollno=" + r);
			if (cnt > 0) {
				System.out.println("Student deleted Successfully");
			} else {
				System.out.println("Error!!!");
			}
		} catch (Exception ex) {
			System.out.println("Exception" + ex.getMessage());
		}
	}

	public static void main(String[] args) {

		DatabaseWork d = new DatabaseWork();
//		d.AddStudent();
		d.Display();
//		d.AddStudentByUser();
//		d.UpdateStudent();
//		d.DeleteStudent();

	}

}
