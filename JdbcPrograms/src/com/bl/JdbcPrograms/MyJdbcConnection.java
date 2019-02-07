
package com.bl.JdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author Aayush C Gandhi
 * Started with JDBC
 * to Establish the connection JDBC the steps are 
 * 1.Load the register Driver
 * 2.Create a Communiaction with DataBase
 * 3.Create the Statement(Platform).
 * 4.Execute the Query
 * 5.Get the ResultSet
 * 6.Finally Close the Connection.
 *	
 */
public class MyJdbcConnection {

	/**
	 * This program illustrates the Use of statement
	 * Performing the Functions like 
	 * Create, Insert, Update and delete using statements.
	 * parallely Reflecting it to the DataBase (MySql) 
	 * @param args
	 */
	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306/test";
		String uid="root";
		String pwd="bridgeit";
		String Query = "select * from Student";
		@SuppressWarnings("unused")
		String insql="insert into Student values(7,'chandu')";
		String sql = "select * from Student order by RegNumber asc";
		String Sql= "delete from Student where RegNumber =1 and Name = 'rahul'";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		@SuppressWarnings("unused")
		int rs1;
		@SuppressWarnings({ "unused", "resource" })
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
