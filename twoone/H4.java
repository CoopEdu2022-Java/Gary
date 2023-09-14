package twoone;

public class H4 {
    public static void main(String[] args) {
    Circle circle = new Circle(5.0);

    System.out.println("Radius: " + circle.getRadius());

    double area = circle.calculateArea();
    double circum = circle.calculateCircumference();

    System.out.println( area);
    System.out.println(circum);
    }

}
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }


}
