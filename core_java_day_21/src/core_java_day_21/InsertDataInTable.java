package core_java_day_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataInTable {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	// step1 - add jar/dependancy into project

	// step2 -load driver to communicate with database
	Class.forName("com.mysql.jdbc.Driver");

	// step3 - create connection with database
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

	System.out.println("connection created");
	
	String insertQuery="insert into student value(?,?,?)";
	
    PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
    preparedStatement.setInt(1, 53);
    preparedStatement.setString(2, "Bharati");
    preparedStatement.setString(3, "Pune");
    
    preparedStatement.execute();
	
	
	
	
	
}
}
