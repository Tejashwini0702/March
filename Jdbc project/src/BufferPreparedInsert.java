import java.sql.Connection;
import java.io.*;
import java.sql.*;
public class BufferPreparedInsert {
	public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sqlprj1", "root", "root");
			PreparedStatement pstmt = conn.prepareStatement("INSERT into emp values(?,?,?,?)");
			
            BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
       
       do {
    	   System.out.println("Enter eid:");
    	   int eid =Integer.parseInt(br.readLine());
    	   System.out.println("Enter firstname:");
    	   String firstname=br.readLine();
    	   System.out.println("Enter lastname:");
    	   String lastname=br.readLine();
    	   System.out.println("Enter age:");
    	   int age=Integer.parseInt(br.readLine());
    	   pstmt.setInt(1, eid);
    	   pstmt.setString(2,firstname);
    	   pstmt.setString(3,lastname);
    	   pstmt.setInt(4, age);
    	   int i=pstmt.executeUpdate();
    	   System.out.println(i+"Records Inserted");
    	   System.out.println("Do you want to continue : y/n");
    	   String s=br.readLine();
    	   if(s.startsWith("n")) {
    		   break;
    	   }
       }while(true);
    	 conn.close();
       }
}
