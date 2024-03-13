package JAVA_0313;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int min = 1000000;
        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        int input = scan.nextInt();
        int[] numbers = new int[input];
        System.out.println(input + "개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        for (int num : numbers) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);
    }
}
