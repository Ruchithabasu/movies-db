package javaDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqliteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcurl="jdbc:sqlite:/C:\\sqlite\\db\\movies.db";
		try {
		     Connection connection=DriverManager.getConnection(jdbcurl);
		     String sql="SELECT * FROM movie";
		     Statement statement=connection.createStatement();
		     ResultSet result = statement.executeQuery(sql);
		     while(result.next()) {
		    	 String name=result.getString("title");
		    	 String name2=result.getString("actor");
		    	 String name3=result.getString("act");
		    	 String name4=result.getString("yor");
		    	 String name5=result.getString("dname");
		    	 System.out.println(name);
		    	 System.out.println(name2);
		    	 System.out.println(name3);
		    	 System.out.println(name4);
		    	 System.out.println(name5);
		}
		}
		catch(SQLException e) {
			System.out.println("Error connecting to SQLite database");
			e.printStackTrace();
		}
	

}
}
