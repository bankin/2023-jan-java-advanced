package _02_Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected double calculateArea() {
        return width * height;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * (width + height);
    }
}
