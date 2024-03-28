package Inflearn.java_0328;

public class Item {
    String name;
    int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("이름:"+name+", 가격:"+price);
    }

    public int getPrice() {
        return price;
    }
}
