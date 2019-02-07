package com.bl.JdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatements {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/test";
		String uid = "root";
		String pwd = "bridgeit";
		Connection con = null;
		ResultSet rs = null;
		
		int id=0;
		String name =null;
		String pos=null;


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//insert
			con = DriverManager.getConnection(url, uid, pwd);

			String query = "{call getAllEmployees()}";
			java.sql.CallableStatement stmt = con.prepareCall(query);
//			stmt.setInt(1,id);
//			stmt.setString(2, name);
//			stmt.setString(3,pos);
		rs=stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
					
						
					
				}
			
		}
	}
}
