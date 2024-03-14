package JAVA_0314;

public class MethodEx2 {
    public static void main(String[] args) {
        outPut("Hello, world!",3);
        outPut("Hello, world!",5);
        outPut("Hello, world!",7);
    }

    public static void outPut(String word, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(word);
        }
    }
}
