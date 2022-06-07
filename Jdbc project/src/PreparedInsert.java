import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class PreparedInsert {
	public static void main(String[] args) {	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sqlprj1","root","root");
		
      		PreparedStatement pstmt=conn.prepareStatement("INSERT INTO emp values(?,?,?,?)");
      		pstmt.setInt(1,8);
      		pstmt.setString(2,"srinivas");
      		pstmt.setString(3,"S");
      		pstmt.setInt(4,40);
      		int i=pstmt.executeUpdate();
      		pstmt.setInt(1,7);
      		pstmt.setString(2,"manjula");
      		pstmt.setString(3,"chalukuti");
      		pstmt.setInt(4,30);
      		int i1=pstmt.executeUpdate();
      		System.out.println(i1+" records inserted");	
      		System.out.println(i+" records inserted");	
		}
	catch (Exception e) {
		e.printStackTrace();
	}
}}
