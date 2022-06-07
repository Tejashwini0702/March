import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sqlprj1", "root", "root");
			Statement stmt = conn.createStatement();
			String sql= "delete from emp where age=21";
			stmt.execute(sql);
			System.out.println(" delete operation is performed......");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
