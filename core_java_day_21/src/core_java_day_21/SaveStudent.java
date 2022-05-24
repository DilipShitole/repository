package core_java_day_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveStudent {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step1 - add jar/dependancy into project

		// step2 -load driver to communicate with database
		Class.forName("com.mysql.jdbc.Driver");

		// step3 - create connection with database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		System.out.println("connection created");

		String sql = "select * from Student";

		Statement statement = connection.createStatement();
   
	    ResultSet resultSet= statement.executeQuery(sql);
	    
	    while(resultSet.next()) {
	    	System.out.println(resultSet.getString(1));
	    	System.out.println(resultSet.getString(2));
	    	System.out.println(resultSet.getString(3));
	    }
	}
}
