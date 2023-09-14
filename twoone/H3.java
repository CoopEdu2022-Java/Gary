package twoone;

public class H3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println(area);
        System.out.println( perimeter);
    }
    
}
class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }


    
}
