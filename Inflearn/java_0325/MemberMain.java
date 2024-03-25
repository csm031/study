package Inflearn.java_0325;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("MyId2","seo");
        member.print();
    }
}
