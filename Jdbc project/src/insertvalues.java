import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertvalues {
	public static void main(String[] args) {	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sqlprj1","root","root");
			Statement stmt = conn.createStatement();
			 String sql = "INSERT INTO emp (Eid, firstname,lastname,age) VALUES (4,'Tejashwini','Sammeta',23)";
	           
	           sql = "INSERT INTO emp (Eid, firstname,lastname,age) VALUES (5,'Raju','Pamula',25)";
	           sql = "INSERT INTO emp (Eid, firstname,lastname,age) VALUES (6,'Ajay','Reddy',21)";
	           stmt.executeUpdate(sql);
	           
	           System.out.println("values are updated....");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
