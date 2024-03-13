package JAVA_0313;
//문제 - 2차원 배열1
//사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
//2차원 배열을 사용하고, 실행 결과 예시를 참고하자

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] student = new int[4][3];
        int[] sum = new int[4];
        double[] average = new double[4];
        String[] subjects = {"국어", "영어", "수학"};
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + "점수:");
                student[i][j] = scan.nextInt();
                sum[i] += student[i][j];

            }
            average[i] = (double) sum[i] / subjects.length;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + sum[i] + ", 평균: " +average[i]);
        }
    }
}
