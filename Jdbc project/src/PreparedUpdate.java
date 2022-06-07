import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sqlprj1", "root", "root");
			PreparedStatement pstmt = conn.prepareStatement("update emp set age=? where eid=?");
			
			pstmt.setInt(1, 42);
			pstmt.setInt(2, 8);
			int i = pstmt.executeUpdate();
			System.out.println(i + " records updated");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
