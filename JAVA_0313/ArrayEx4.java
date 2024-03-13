package JAVA_0313;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        int input = scan.nextInt();
        int[] numbers = new int[input];
        System.out.println(input+"개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
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
