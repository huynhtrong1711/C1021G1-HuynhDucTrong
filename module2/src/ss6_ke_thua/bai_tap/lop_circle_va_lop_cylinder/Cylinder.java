package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume() {
        return height * (getRadius() * getRadius()) * 3.14;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", height=" + height +
                ". volume=" + getVolume() ;
    }
}
