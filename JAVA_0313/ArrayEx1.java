package JAVA_0313;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] Student = {90,80,70,60,50};
        int total = 0;
        for (int i : Student) {
             total += i;
        }
        double average = (double) total/Student.length;
        System.out.println("점수총합: " + total);
        System.out.println("점수평균: " + average);
    }
}
