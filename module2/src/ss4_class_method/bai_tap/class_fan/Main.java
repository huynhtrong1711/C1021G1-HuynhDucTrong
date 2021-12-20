package ss4_class_method.bai_tap.class_fan;

public class Main {
    public  byte slow = 1;
    public  byte medium= 2;
    public  byte fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5.0f;
    private String color = "Blue";

    public Main(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public boolean turnOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                " Speed = " + speed +
                " , on = " + (turnOn() ? "fan is on" : "fan is off") +
                " , Radius = " + radius +
                " , Color = " + color +
                "}";
    }
}
