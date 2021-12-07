package ss5_static_access_modefiers.bai_tap.access_modefiers;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }
    protected double getArea() {
        return radius * radius * 3.14;
    }
}
