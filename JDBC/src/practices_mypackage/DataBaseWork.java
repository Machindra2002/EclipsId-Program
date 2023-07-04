package practices_mypackage;
import java.sql.*;


public class DataBaseWork {
	
	public void Display() {
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		
		}
		catch(Exception ex) {
			System.out.println("Exception="+ex);
		}
		
	}

	public static void main(String[] args) {
		

	}

}
