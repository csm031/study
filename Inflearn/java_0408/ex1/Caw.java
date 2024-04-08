package Inflearn.java_0408.ex1;

public class Caw implements InterfaceAnimal{
    @Override
    public void move() {
        System.out.println("음머");
    }

    @Override
    public void sound() {
        System.out.println("소 이동");
    }
}
