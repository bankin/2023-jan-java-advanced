package DemoShapes.nested;

import DemoShapes.Rectangle;
import DemoShapes.Shape;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public boolean hasLessArea(Shape shape) {

        return getArea() < shape.getArea();
    }
}
