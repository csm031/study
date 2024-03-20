package JAVA_0320;
//트랜젝션 Transaction 개념

import java.sql.*;
import java.util.Scanner;

public class JdbcEx6 {
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
            con.setAutoCommit(false); // 오토커밋 해제
            String sql = "insert into \"INFO\"(\"NUM\",\"NAME\",\"BIRTH\",\"PHONE\") values (INFO_SEQ.nextval,?,sysdate,?)"; // 물음표는 바인딩 변수
            pstmt = con.prepareStatement(sql);
            // 무조건 실행 성공
            pstmt.setString(1, "최승문"); // 첫번째 물음표에 setName String 값을 삽입함
            pstmt.setString(2, "010-1234-4567"); // 두번째 물음표에 number 값을 삽입

           int result = pstmt.executeUpdate(); // select만 executeQuery 나머지 update,delete,insert는 executeUpdate사용
            if (result==1){
                System.out.println("삽입 성공");
                
            }
            else {
                System.out.println("삽입 실패");
            }
            // 무조건 실행 실패 (기본키를 중복되게 바꾸었기 때문)
            sql = "UPDATE \"INFO\" SET \"NUM\"=INFO_SEQ.currval WHERE NAME = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,"홍길동");
            result = pstmt.executeUpdate();
            if (result==1){
                System.out.println("수정 성공");
                con.commit(); // 직접 커밋
            }
            else {
                System.out.println("수정 실패");
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            con.rollback();
            System.out.println("롤백되었습니다.");
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
