package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyFirstPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver register hua");
		//connetion establishe
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jdbc_demo", "root", "root");
		//step 3 prepared the statement
		System.out.println("connetion done");
		PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?,?,?)");
																			//	  1 2 3 4 5			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Id");
		int id=sc.nextInt();
		
		System.out.println("Enter the Employee Name");
		String name=sc.next();
		
		System.out.println("Enter the Employee Designation");
		String desig=sc.next();
		
		System.out.println("Enter the Employee Department");
		String dept=sc.next();
	
		System.out.println("Enter the Employee Salary");
		int sal=sc.nextInt();
		
		System.out.println(id+"  "+name+"  "+desig+"  "+dept+"  "+sal);
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, desig);
		pstmt.setString(4, dept);
		pstmt.setInt(5, sal);
		
		//step 4// excecuting the statemnet
		int i=pstmt.executeUpdate();
		//step 5
		//con.close();
		System.out.println(i+ "Employee ka record add hua");

	}

}
