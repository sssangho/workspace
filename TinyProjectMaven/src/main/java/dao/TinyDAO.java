package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.TinyDTO;

public class TinyDAO {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {  // DBMS 접속
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "scott", "tiger");
		return conn;
	}
	
	public List<TinyDTO> selectList() {  // tiny 테이블의 모든 자료를 가져옴
		List<TinyDTO> list = new ArrayList<TinyDTO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
		    conn = getConnection();
//		    stmt = conn.createStatement();
//		    rs = stmt.executeQuery("SELECT * FROM tiny");
		    pstmt = conn.prepareStatement("SELECT * FROM tiny");
		    rs = pstmt.executeQuery();
		    while (rs.next()) {
		        int num = rs.getInt("num");
		        String content = rs.getString("content");
		        list.add(new TinyDTO(num, content));
		    }
		} catch (SQLException e) {
			System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (rs != null) rs.close();
		        if (pstmt != null) pstmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}
		return list;
	}
	
	public void insertOne(TinyDTO dto) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;

		try {
		    conn = getConnection();
//		    stmt = conn.createStatement();
//		    stmt.executeUpdate(String.format("insert into tiny(num, content) values (tiny_seq.nextval, '%s')", dto.getContent()));
		    
		    pstmt = conn.prepareStatement("insert into tiny(num, content) values (tiny_seq.nextval, ?)");
		    pstmt.setString(1, dto.getContent());
		    pstmt.executeUpdate();
		  
		} catch (SQLException e) {
			System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (pstmt != null) pstmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}
	}
	
	public void deleteOne(String num) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;

		try {
		    conn = getConnection();
//		    stmt = conn.createStatement();
//		    stmt.executeUpdate(String.format("delete from tiny where num = %s", num));
		    pstmt = conn.prepareStatement("delete from tiny where num = ?");
		    pstmt.setString(1, num);
		    pstmt.executeUpdate();
		  
		} catch (SQLException e) {
			System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (pstmt != null) pstmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}
	}
	
	public TinyDTO selectOne(String num) {
		TinyDTO dto = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
		    conn = getConnection();
//		    stmt = conn.createStatement();
//		    rs = stmt.executeQuery("SELECT * FROM tiny where num = " + num);
		    pstmt = conn.prepareStatement("SELECT * FROM tiny where num = ?");
		    pstmt.setString(1, num);
		    rs = pstmt.executeQuery();
		    if (rs.next()) {
		        int num1 = rs.getInt("num");
		        String content = rs.getString("content");
		        dto = new TinyDTO(num1, content);
		    }
		} catch (SQLException e) {
			System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (rs != null) rs.close();
		        if (pstmt != null) pstmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}
		return dto;
	}
	
	public void updateOne(TinyDTO dto) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
		    conn = getConnection();
//		    stmt = conn.createStatement();
//		    stmt.executeUpdate(String.format("update tiny set content = '%s' where num = %d", dto.getContent(), dto.getNum()));
		    pstmt = conn.prepareStatement("update tiny set content = ? where num = ?");
		    pstmt.setString(1, dto.getContent());
		    pstmt.setInt(2, dto.getNum());
		    pstmt.executeUpdate();
		  
		} catch (SQLException e) {
			System.out.println("데이터베이스 오류: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
		} finally {
		    try {
		        if (pstmt != null) pstmt.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		    	System.out.println("리소스를 닫는 도중 오류 발생: " + e.getMessage());
		    }
		}
	}
}
