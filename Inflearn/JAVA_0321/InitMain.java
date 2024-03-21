package Inflearn.JAVA_0321;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("data.value1 = " + data.value1); // 초기화 안한 값
        System.out.println("data.value2 = " + data.value2); // 10으로 초기화 한 값
    }
}
