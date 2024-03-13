package JAVA_0313;
import java.util.Scanner;
public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbers = new int[5];
        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i <5 ; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.println("출력");
        for (int i = 0; i <5 ; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length-1) {
                System.out.print(", ");
            }
        }
        //입력받은 역순으로 출력
        System.out.println("역순으로 출력합니다");
        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 4; i >=0 ; i--) {
            numbers[i] = scan.nextInt();
        }
        System.out.println("출력");
        for (int i = 0; i <5 ; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length-1) {
                System.out.print(", ");
            }
        }
    }
}
