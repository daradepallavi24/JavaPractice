package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdateDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jdbc_demo", "root", "root");
		/*Student table- id name address,course marks
		
		craete table
		desc
		
		syso("input your choice");
		1
		
		switch()
		update emp set  name='tom', sal='amsterdam' where id=241;
		case:1
		
			insertStudnet()
			
		case:2 
		
			updateStudent()
			
		case 3:
			
			delete()
		
			studentData
			
			
			
			*/
				Statement stmt = con.createStatement();
				
				String sql="update emp set desig ='sr.manager' where id=1";
				
				int i=stmt.executeUpdate(sql);
				
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