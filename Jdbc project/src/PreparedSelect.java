import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedSelect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sqlprj1", "root", "root");
			PreparedStatement pstmt = conn.prepareStatement("SELECT * from emp Order by lastname ASC");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("d:" + rs.getInt(1) + " " + rs.getString(3));// " " + rs.getString(column of lastname)
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
