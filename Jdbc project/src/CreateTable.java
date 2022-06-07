import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sqlprj1","root","root");
			Statement stmt = conn.createStatement();
			String sql ="CREATE TABLE EMP"+
			                 "(eid INTEGER not NULL,"+
				              "firstname VARCHAR(255),"+
			                 "lastname VARCHAR(255),"+
				              "age INTEGER,"+
				              "PRIMARY KEY (eid))";
			stmt.executeUpdate(sql);
			System.out.println("created table in given database...."); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
