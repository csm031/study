package Inflearn.java_0408.ex1;

import Inflearn.java_0408.AbstractAnimal;

public class InterfaceAnimalMain {

    public static void main(String[] args) {
//        인터페이스 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();


        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }

    // 변하지 않는 부분
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물이동 시작");
        animal.move();
        System.out.println("동물 이동 종료");
    }
}

