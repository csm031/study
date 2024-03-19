package JAVA_0319.JDBC;
//PreparedStatement로 교체

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEx4 {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String url = "Jdbc:oracle:thin:@localhost:1521:xe";
        String id = "c##scott";
        String pass = "scott";
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("클래스 로딩 성공");
            con = DriverManager.getConnection(url, id, pass);
            System.out.println("데이터베이스 접속 성공");
            String sql = "select \"NAME\", \"NUM\", \"BIRTH\" from \"INFO\" WHERE \"NAME\" = ? or \"NUM\" = ?"; // 물음표는 바인딩 변수
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,"홍길동"); // 첫번째 물음표에 "홍길동" 이라는 String 값을 삽입함
            pstmt.setInt(2,1); // 두번째 물음표에 1이라는 int값을 삽입 

            rs = pstmt.executeQuery();
            while (rs.next()) {   // 자료형을 잘 선언하고 숫자말고 컬럼명으로 선언도 가능하다
                System.out.println("이름 : " + rs.getString("name"));
                System.out.println("번호 : " + rs.getInt("num"));
                System.out.println("생일 : " + rs.getDate("BIRTH"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
