package _02_Shape;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(3, 4);

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
