package Inflearn.JAVA_0322;

public class RectangleOopMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 8;

        rectangle.area = rectangle.calculateArea();
        System.out.println("넓이: " + rectangle.area);

        rectangle.perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + rectangle.perimeter);

        rectangle.square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + rectangle.square);
    }
}
