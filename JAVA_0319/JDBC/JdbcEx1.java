package JAVA_0319.JDBC;

import java.sql.Connection; // DB연결
import java.sql.DriverManager; // DB 드라이버 찾을때 사용
import java.sql.ResultSet; // sql문 결과 출력
import java.sql.SQLException; // 오류 감지
import java.sql.Statement; // sql쿼리 저장

public class JdbcEx1 {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String url = "Jdbc:oracle:thin:@localhost:1521:xe";
        String id = "c##scott";
        String pass = "scott";
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("클래스 로딩 성공");
            con = DriverManager.getConnection(url, id, pass);
            System.out.println("데이터베이스 접속 성공");
            StringBuffer sql = new StringBuffer();
            sql.append("select * from \"INFO\"");
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql.toString());
            while (rs.next()) {       // 자료형을 잘 선언하고 숫자말고 컬럼명으로 선언도 가능하다
                System.out.println(rs.getInt(1)); // 1번말고 "NUM"
                System.out.println(rs.getString(2)); // 2번 말고 "NAME"
                System.out.println(rs.getDate(3));
                System.out.println(rs.getString(4));
                System.out.println();
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
            if (stmt != null) {
                try {
                    stmt.close();
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
