package JAVA_0314;
//문제 - 입출금 리펙토링
//다음은 입금, 출금을 나타내는 코드이다.
//입금(deposit)과, 출금(withdraw)을 메서드로 만들어서 리펙토링 해보자.
public class MethodEx3 {
    static int balance = 10000;

    public static void main(String[] args) {
        deposit(1000);
        withdraw(2000);

        System.out.println("최종 잔액: " + balance + "원");
    }
    //출금
    public static void withdraw(int withdrawAmount){
        
        if (balance<withdrawAmount){
            System.out.println(withdrawAmount+"원을 출금하려 했으나 잔액이 부족합니다.");
        }
        else {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance+"원");
        }
        
    }
    
    //입금
    public static void deposit(int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance+"원");
    }
}
