package Inflearn.JAVA_0322;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (isCountValid(count)) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    private boolean isCountValid(int count) {
        // 금액이 0보다 커야함
        return max == count;
    }
}
