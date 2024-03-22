package Inflearn.JAVA_0322;

public class Rectangle {
    int width =0;
    int height = 0;
    int area = 0;
    int perimeter = 0;
    boolean square = false;


    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }
    boolean isSquare() {
        return width == height;
    }
}
