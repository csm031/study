package Inflearn.JAVA_0321;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder("두부", 2000, 2);
        ProductOrder productOrder2 = new ProductOrder("김치", 5000, 1);
        ProductOrder productOrder3 = new ProductOrder("콜라", 1500, 2);

        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};

        int sum = 0;
        for (ProductOrder po : productOrders) {
            System.out.println("상품명: " + po.productName + ", 가격: " + po.price + ", 수량: " + po.quantity);
            sum += po.price * po.quantity;
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
