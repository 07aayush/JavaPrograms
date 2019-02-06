package Com.Bl.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestingJdbcPerparedStatements {

	public static void main(String[] args) throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/test";
		String uid = "root";
		String pwd = "bridgeit";
		Connection con = null;
		ResultSet rs = null;
		int id = 0;
		String name = null;
		@SuppressWarnings("unused")
		String Pos = null;
		PreparedStatement ps_ins = null;
		Scanner sc = new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		//insert
			con = DriverManager.getConnection(url, uid, pwd);
			//			System.out.println("enter enployee id");
			//			String id = sc.next();
			//			System.out.println("enter employee name");
			//			String name = sc.next();
			//			System.out.println("enter employee position");
			//			String Pos = sc.next();
			//			

			
			//delete
			String sa = "delete from  Employees where Emp_id = ?";
			PreparedStatement ps =con.prepareStatement(sa);
			System.out.println("enter the id");
			int c =sc.nextInt();
			ps.setInt(1, c);
			ps.executeUpdate();

			
			//update
			String sql = "update Employees set Emp_name=? where Emp_id =?";
			PreparedStatement ps_sql = con.prepareStatement(sql);

			System.out.println("enter the id ");
			id = sc.nextInt();

			System.out.println("enter the name that you want to update");
			name = sc.next();

			// Bind values into the parameters.
			ps_sql.setString(1, name); // This would set name
			ps_sql.setInt(2, id); // This would set id

			ps_sql.executeUpdate();

			// ps_ins = con.prepareStatement("insert into
			// Employees(Emp_id,Emp_name,Emp_Position) values(?,?,?)");
			ps_sql = con.prepareStatement("select * from Employees");
			//
			//			ps_ins.setString(1, id);
			//			ps_ins.setString(2, name);
			//			ps_ins.setString(3, Pos);

			// ps_ins.executeUpdate();
			ps_sql.execute();

			rs = ps_sql.getResultSet();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			sc.close();
		}

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps_ins != null)
					ps_ins.close();

				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}