package sec01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3305/spring5fs";
		Connection con = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("sql문 입력>");
		String sql = scan.nextLine();
		
		// JDBC를 통해서 결과를 받아 출력하세요.
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, id, pw);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			String str1 = rs.getString(1);
			String str2 = rs.getString(2);
			String str3 = rs.getString(3);
			System.out.printf("%-10s\t%s\t%s\n", str1, str2, str3);
//			if(sql.contains("emp")) {
//				int empno = rs.getInt("empno");
//				String ename = rs.getString("ename");
//				String job = rs.getString("job");
//				System.out.printf("%d\t%s\t%s\n",empno,ename,job);
//			} else if (sql.contains("dept")) {
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
//				System.out.printf("%d\t%s\t%s\n",deptno, dname, loc);
//			}
		}
		rs.close();
		stmt.close();
		con.close();

	}

}
