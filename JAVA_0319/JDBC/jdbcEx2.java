package JAVA_0319.JDBC;
//count 및 별칭을 사용한 쿼리문으로 바꿔서 출력
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEx2 {
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
            sql.append("select count(*) as \"cnt\" from \"INFO\""); // count에 별칭으로 cnt라고 지어줌
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql.toString());
            while (rs.next()) {   // 자료형을 잘 선언하고 숫자말고 컬럼명으로 선언도 가능하다
                System.out.println("레코드수 : " + rs.getInt("cnt")); // cnt말고 "1"도 가능
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
