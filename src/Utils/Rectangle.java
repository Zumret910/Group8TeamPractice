package Utils;
// Rectangle.java
public class Rectangle {
    // Fields for width and height
    private double width;
    private double height;

    // Constructor to initialize the rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(7, 3);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}

