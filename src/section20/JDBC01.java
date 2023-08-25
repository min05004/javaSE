package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * JDBC (JAVA DataBase Connectivity)
 *  자바 어플리케이션에서 데이터 베이스와 통신할 수 있는 API
 * 
 * 
 * 
 * 
 */
public class JDBC01 {
	public static void main(String[] args) {

		Connection conn= null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//데이터 베이스 연결
			String ur1 = "jdbc:oracle:thin:@localhost:21521:xe"; // 데이터베이스에 접속
			conn = DriverManager.getConnection(ur1,"hr","hr"); // 아이디 , 비번
			
			//쿼리 수행을 위해 객체 생성 - 메모리공간이 생김.
			stmt = conn.createStatement();
			
			//쿼리 작성 : 부서번호가 30번인 사람들.
			String param ="30"; 
			String sql = "SELECT * FROM employees WHERE department_id = " + param;
			
			//쿼리수행 - 데이커 베이스에서 실행해서 결과를 보이게 한것과 동일
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) { //커서 역할
				String employeeId = rs.getString("employee_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				
				System.out.println(employeeId + "/" + firstName + "/"+ lastName);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}





