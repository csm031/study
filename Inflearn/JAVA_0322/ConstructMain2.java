package Inflearn.JAVA_0322;

public class ConstructMain2 {

    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] memberConstructs = {member1, member2};

        for (MemberConstruct member : memberConstructs) {
            System.out.println("이름: " + member.name + " 나이 : " + member.age + " 성적 : " + member.grade);
        }
    }
}
