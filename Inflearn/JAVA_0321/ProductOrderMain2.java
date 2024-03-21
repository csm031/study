package Inflearn.JAVA_0321;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = {createOrder("두부", 2000, 2),
                createOrder("김치", 5000, 1),
                createOrder("콜라", 1500, 2)
            };

        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: "
                    + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
