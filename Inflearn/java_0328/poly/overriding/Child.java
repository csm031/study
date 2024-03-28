package Inflearn.java_0328.poly.overriding;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
