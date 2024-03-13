package JAVA_0313;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double average = 0;
        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scan.nextInt();
        }
        for (int num : numbers) {
            sum += num;
        }
        average = (double) sum / numbers.length;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
