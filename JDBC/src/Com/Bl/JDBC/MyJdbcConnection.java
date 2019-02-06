package Com.Bl.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyJdbcConnection {

	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306/test";
		String uid="root";
		String pwd="bridgeit";
		String Query = "select * from Student";
		String insql="insert into Student values(5,'chandu')";
		String sql = "select * from Student order by RegNumber asc";
		String Sql= "delete from Student where RegNumber =1 and Name = 'rahul'";

		
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int rs1;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, uid, pwd);
			
			 

			
			stmt = con.createStatement();
			
			rs1=stmt.executeUpdate(Sql);
			//rs1=stmt.executeUpdate(insql);
			rs=stmt.executeQuery(Query);
			rs=stmt.executeQuery(sql);
		
		
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));

			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
				try {
					if(rs!=null)
						rs.close();
					if(stmt!=null)
						stmt.close();
					if(con!=null)
						con.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
