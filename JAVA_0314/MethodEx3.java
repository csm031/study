package JAVA_0314;

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
