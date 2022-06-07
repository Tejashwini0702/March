import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDelete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sqlprj1", "root", "root");
			
			PreparedStatement pstmt = conn.prepareStatement(" delete from emp where lastname = ?");
			pstmt.setString(1, "S");
			int i = pstmt.executeUpdate();
		System.out.println(i+" records deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}}}
