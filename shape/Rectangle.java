package lesson2.shape;

public class Rectangle extends Figure{

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double area() {

        return width * length;
    }

    @Override
    double perimeter() {

        return width*2 + length*2;
    }
}