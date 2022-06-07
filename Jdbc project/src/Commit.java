import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Commit {
	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sqlprj1", "root", "root");	
			
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			String query1="INSERT into Learner(LID,Lname) Values(4,'ajay')";
			String query2="INSERT into Learner(LID,Lname) Values(5,'rachana')";
		
			stmt.executeUpdate(query1);
			stmt.executeUpdate(query2);	
			
			conn.commit();
			System.out.println("Row Inserted");
		}
	
	 catch (Exception e) {
			e.printStackTrace();
		}
}}
