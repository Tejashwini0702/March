import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class rollback {
	public static void main(String[] args)  {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sqlprj1", "root", "root");			
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			String query1="INSERT into trainer(TID,Tsubject) Values(4,'c')";
			String query2="INSERT into trainer(TID,Tsubject) Values(5,'python')";
			stmt.executeUpdate(query1);
			stmt.executeUpdate(query2);	
			
			conn.commit();
			System.out.println("Row Inserted");
		}
	
	 catch (Exception e) {
		 try {
			conn.rollback();
		 }catch(SQLException e1) {
			 e1.printStackTrace();
		 }
		 System.out.println("Transaction failed.....!");
			e.printStackTrace();
		}
}

}
