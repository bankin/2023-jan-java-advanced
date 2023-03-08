package DemoShapes;

import DemoShapes.nested.Square;
import DemoShapes.nested.inner.Circle;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 6);
        Shape square = new Square(7);
        Shape circle = new Circle();

//        System.out.println(rectangle.getClass());
//        System.out.println(Rectangle.class.getSimpleName());
//        System.out.println(square.getClass());
//        System.out.println(Square.class);
//        System.out.println(circle.getClass());
//        System.out.println(Shape.class);
//        System.out.println(int.class);

        System.out.println(square instanceof Shape);

        System.out.println(square.getClass() == Rectangle.class);
        System.out.println(square.getClass() == Square.class);
        System.out.println(square.getClass() == Circle.class);

        if (square instanceof Square) {
            System.out.println(((Square) square).hasLessArea(circle));
        }

    }
}
