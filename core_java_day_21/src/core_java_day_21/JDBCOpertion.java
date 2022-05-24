package core_java_day_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCOpertion {
	public static void main(String[] args) 
	  {
	    Connection connection = null;
	    PreparedStatement pstmt = null;
	    String sql = "INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME,STAT_CD) VALUES (?,?,?,?)";
	    try
	    {
	      Class.forName("com.mysql.jdbc.Driver");
	      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
	       
	      pstmt = connection.prepareStatement(sql);
	      pstmt.setInt(1, 10);
	      pstmt.setString(2, "Mahesh");
	      pstmt.setString(3, "Pawar");
	      pstmt.setInt(4, 80);
	      int affectedRows = pstmt.executeUpdate();
	      System.out.println(affectedRows + " row(s) affected !!");
	    } 
	    catch (Exception e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        pstmt.close();
	        connection.close();
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	    }
	  }
}
