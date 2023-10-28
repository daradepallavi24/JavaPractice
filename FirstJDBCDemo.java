package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FirstJDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver register hua");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jdbc_db", "root", "root");
		System.out.println("connetion done");
		PreparedStatement pstmt=con.prepareStatement("insert into register values('Pallavi','Pallavi@gmail.com','pallavi','pall','palla')");
																					
		int i=pstmt.executeUpdate();
		if(i>0) 
		{
			System.out.println("Success");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
}