package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC02 {
	public static void main(String[] args) {
		
		Connection conn = null;
		//Statement 사용말고 PreparedStatement 사용하기
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//메모리에 클래스 정보를 올려줌
			
			//2.데이터 베이스 연결
			String ur1 = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(ur1,"hr","hr"); //사용자 아이디 비밀번호 이용하여 접속
			
			/*SELECT employee_id, last_name, job_id, salary
			FROM employees
			WHERE salary >= 10000
			AND job_id LIKE '%MAN%';
			 * 
			 */
			
			
			//3.쿼리 작성
			StringBuffer sql = new StringBuffer(); // 자주 바뀌는 값은 메모리 효율을 위해 버퍼 씌워서 사용하기 
			sql.append("SELECT employee_id, last_name, job_id, salary ");//띄어쓰기 꼭확인하기
			sql.append("FROM employees ");
			sql.append("WHERE salary >= ? " );
			sql.append("AND job_id LIKE '%'||?||'%' ");
			sql.append("ORDER BY salary DESC");
			
			//4.prepareStatement 객체 생성 .? 안에 바뀌는 변수 값이 들어감.
			
			psmt =conn.prepareStatement(sql.toString());
			
			psmt.setInt(1, 10000);
			psmt.setString(2, "MAN");
			
			//5.쿼리 수행
			rs = psmt.executeQuery();
			
			//6.실행결과 출력하기
			while(rs.next()){
				int id=rs.getInt("employee_id");
				String lastName = rs.getString("last_name");
				String jobId = rs.getString("job_id");
				double salary =rs.getDouble("salary");
				
				System.out.printf("%d/%s/%s/%f\n",id,lastName,jobId,salary); //각 요소에 값이 들어가서 출력
				
			}
			
			
		} catch (Exception e) {
		
		}finally {
			try {
				if(rs != null)rs.close();
				if(psmt != null)psmt.close();
				if(conn != null)conn.close();
				
			} catch (Exception e2) {}
			
		}
		
	}

}
