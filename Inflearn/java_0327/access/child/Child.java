package Inflearn.java_0327.access.child;

import Inflearn.java_0327.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속관계 or 같은 패키지
//        defaultValue = 1; // 다른 패키지 접근 불가 컴파일 오류
        /*privateValue // 당연히 접근 불가*/

        publicMethod();
        protectedMethod();

        printParent();
    }
}
