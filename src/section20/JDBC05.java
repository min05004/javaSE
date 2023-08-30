package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC05 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		// Statement 사용하지 않기!! PrepareStatement 사용하기!!! 
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		
		try {
			// 1. 드리이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
					
			// 3. 쿼리 작성
			pstmt = conn.prepareStatement(
					"DELETE FROM sales_reps "
					+ "WHERE id = ?"
					);
			
			pstmt.setInt(1, 1);
			
			int reuslt = pstmt.executeUpdate();
			if(reuslt > 0) {
				System.out.println("데이터 DELETE 성공!");
			} else {
				System.out.println("데이터 DELETE 실패!");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
	}

}