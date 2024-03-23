package Inflearn.java_0323;

public class Data2 {
    public String name;

    public Data2(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }
}
