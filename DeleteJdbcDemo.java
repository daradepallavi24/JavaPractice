package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteJdbcDemo {
//crud- create-retrive-update-delete
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jdbc_demo", "root", "root");
		Statement stmt = con.createStatement();
		
		String sql="delete from emp where id=1";
		
		stmt.executeUpdate(sql);
		
		ResultSet rs= stmt.executeQuery("select * from emp");	
		//System.out.println(rs);
		int id ;
		String name = null,desig,dept;
		int sal;		
		System.out.println("Employe details");
		System.out.println("============");	
		while(rs.next())
		{
			id=rs.getInt(1);
			name=rs.getString(2);
			desig=rs.getString(3);
			dept=rs.getString(4);
			sal=rs.getInt(5);
			System.out.println(id+"  "+name+"  "+desig+"  "+dept+"  "+sal);
		}
		con.close();


	}

}
