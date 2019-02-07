package com.bl.JdbcPrograms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatements {

	/**
	 * callable Statements
	 * CRUD operations
	 * Invoking Stored Procedures
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/test";
		String uid = "root";
		String pwd = "bridgeit";
		Connection con = null;
		ResultSet rs = null;
		@SuppressWarnings("unused")
		int Emp_id=0;
		String Emp_name =null;
		String Emp_pos=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, uid, pwd);
			
			//update
//			CallableStatement call=con.prepareCall("{call Employee_details1(?,?)}");
//			call.setString(1, Emp_name);
//			call.setString(2, Emp_pos);
//			call.execute();
			
			//delete
			
			CallableStatement call2=con.prepareCall("{call Employee_Details(?,?)}");
			call2.setString(1, Emp_name);
			call2.setString(2, Emp_pos);
			call2.execute();
			
			//display
//			String query = "{call getAllEmployees()}";
//			java.sql.CallableStatement stmt = con.prepareCall(query);
			
//			stmt.setInt(1,id);
//			stmt.setString(2, name);
//			stmt.setString(3,pos);
//	rs=stmt.executeQuery();
			
			//insert
				CallableStatement cal=con.prepareCall("{call Employees_details(?,?)}");
			 cal.setString(1,Emp_name);
			 cal.setString(2,Emp_pos);
			 cal.execute();
		  System.out.println("Your data has been inserted");
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
//			}
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
