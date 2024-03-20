package JAVA_0320;
//PreparedStatement로 insert

import java.sql.*;
import java.util.Scanner;

public class JdbcEx5 {
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
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
            System.out.print("저장할 이름을 입력해주세요: ");
            String setName = scan.nextLine();
            System.out.print("저장할 번호를 입력해주세요: ");
            String number = scan.nextLine();
            String sql = "insert into \"INFO\"(\"NUM\",\"NAME\",\"BIRTH\",\"PHONE\") values (INFO_SEQ.nextval,?,sysdate,?)"; // 물음표는 바인딩 변수
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, setName); // 첫번째 물음표에 setName String 값을 삽입함
            pstmt.setString(2, number); // 두번째 물음표에 number 값을 삽입

           int result = pstmt.executeUpdate(); // select만 executeQuery 나머지 update,delete,insert는 executeUpdate사용
            if (result==1){
                System.out.println("삽입 성공");
            }
            else {
                System.out.println("삽입 실패");
            }
//            while (rs.next()) {   // 자료형을 잘 선언하고 숫자말고 컬럼명으로 선언도 가능하다
//                System.out.println("이름 : " + rs.getString("name"));
//                System.out.println("번호 : " + rs.getInt("num"));
//                System.out.println("생일 : " + rs.getDate("BIRTH"));
//            }
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
