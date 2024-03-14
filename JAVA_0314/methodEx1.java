package JAVA_0314;
//문제 - 평균값 리펙토링
public class methodEx1 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        int sum = add(a,b,c);
        aver(sum);

        int x = 15;
        int y = 25;
        int z = 35;

        sum = add(x,y,z);
        aver(sum);
    }
    public static int add (int a, int b, int c){
       int sum = a + b + c;
        return sum;
    }
    public static void aver(int sum){
        double average = sum/3.0;
        System.out.println("평균값: "+average);
    }
}
